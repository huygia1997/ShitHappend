package com.dfksoft.hrm_manage.controller;

import com.dfksoft.hrm_manage.entity.*;
import com.dfksoft.hrm_manage.service.AccountService;
import com.dfksoft.hrm_manage.service.EmployeesService;
import com.dfksoft.hrm_manage.service.RolesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeesController {
    private final EmployeesService employeesService;
    private final AccountService accountService;
    private final RolesService rolesService;

    public EmployeesController(EmployeesService employeesService, AccountService accountService, RolesService rolesService) {
        this.employeesService = employeesService;
        this.accountService = accountService;
        this.rolesService = rolesService;
    }

    @RequestMapping("/employees")
    public String index(Model model) {
        List<Employees> employees = employeesService.getAllEmployees();
        List<EmployeeData> employeeDataList = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            String username = employees.get(i).getUsername();
            String macAddress = employees.get(i).getMacAddress();
            AccountId accountId = new AccountId();
            accountId.setMacAddress(macAddress);
            accountId.setUsername(username);
            Account account = accountService.findAccountById(accountId);
            Roles roles = rolesService.findById(account.getRole_id());
            EmployeeData employeeData = new EmployeeData();
            employeeData.setRoles(roles);
            employeeData.setAccount(account);
            employeeData.setEmployees(employees.get(i));
            employeeDataList.add(employeeData);

        }



        model.addAttribute("employeesData", employeeDataList);


        return "employees";
    }

    @RequestMapping("/registerEmployee")
    public String registerEmployee(@RequestParam("username") String username, @RequestParam("role") int role,
                                   @RequestParam("macAddress") String macAddress, @RequestParam("lastName") String lastName,
                                   @RequestParam("firstName") String firstName, @RequestParam("address") String address,
                                   @RequestParam("sex") String sex, @RequestParam("phone") String phone, Model model) {
        Employees employees = new Employees();
        Account account = new Account();

        AccountId accountId = new AccountId();
        accountId.setMacAddress(macAddress);
        accountId.setUsername(username);

        account.setId(accountId);
        account.setPassword("123456");
        account.setRole_id(role);
        accountService.saveAccount(account);

        employees.setAddress(address);
        employees.setFirst_name(firstName);
        employees.setLast_name(lastName);
        employees.setMacAddress(macAddress);
        employees.setPhone(phone);
        employees.setSex(sex);
        employees.setUsername(accountId.getUsername());
        employeesService.saveEmployee(employees);



        return "devices";
    }
}
