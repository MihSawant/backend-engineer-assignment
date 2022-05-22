package com.nunam.backendengineerassignemnt.controller;

import com.nunam.backendengineerassignemnt.entity.Cell;
import com.nunam.backendengineerassignemnt.repo.CellRepository;
import com.nunam.backendengineerassignemnt.service.DashboardService;
import com.nunam.backendengineerassignemnt.service.SohCalcService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Controller("/")
public class DashboardController {

    private final CellRepository cellRepository;
    private final SohCalcService service;

    private final DashboardService dashboardService;

    public DashboardController(CellRepository cellRepository, SohCalcService service,
                               DashboardService dashboardService){
        this.cellRepository = cellRepository;
        this.service = service;
        this.dashboardService = dashboardService;
    }

    @GetMapping
    public String dashBoardPage(Model model){
        model.addAttribute("cells",
                getCells());
        model.addAttribute("one", service.getSoh().get(0));
        model.addAttribute("two", service.getSoh().get(1));
        return "soh";
    }

    @GetMapping("/{id}")
    public String cellIdPage(@PathVariable Integer id, Model model){

        model.addAttribute("capacities",
                dashboardService.allCapacitiesById(Long.valueOf(id)).stream()
                        .limit(10).collect(Collectors.toList()));
        model.addAttribute("voltages",
                dashboardService.allVoltagesById(Long.valueOf(id)).stream()
                        .limit(10).collect(Collectors.toList()));
        model.addAttribute("temprature",
                dashboardService.allTemperaturesById(Long.valueOf(id)).stream()
                        .limit(10).collect(Collectors.toList()));
        model.addAttribute("time",
                dashboardService.allTimesById(Long.valueOf(id)).stream()
                        .limit(10).collect(Collectors.toList()));

        model.addAttribute("curr", dashboardService.allCurrentsById(Long.valueOf(id))
                .stream().limit(10).collect(Collectors.toList()));

        model.addAttribute("cells",
                getCells());

        model.addAttribute("heading", getCells().get(id - 1));

        return "detail";
    }

    private List<String> getCells() {
        return cellRepository.findAll()
                .stream()
                .map(Cell::getCellId).collect(Collectors.toList());
    }
}
