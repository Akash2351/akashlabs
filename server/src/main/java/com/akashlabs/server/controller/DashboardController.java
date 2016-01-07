package com.akashlabs.server.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * User: thejar
 */
@Controller
public class DashboardController {

   /* @Autowired
    private MachineService machineService;

    @Autowired
    private ModuleService moduleService;

    @RequestMapping(value = "/kpis", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, List<KPIData>> getKPIs() throws RestException {

        List<KPIData> kpis = new ArrayList<>();

        MachineMetaFilter filter = new MachineMetaFilter();
        filter.setIocScoreLowerLimit(1024);
        List<MachineDefinition> highRiskMachines = machineService.getMachineDefinitions(filter);
        KPIData kpiHighRisk = new KPIData(KPIType.HIGH_RISK_MACHINES);
        kpiHighRisk.setName("High Risk Machines");
        kpiHighRisk.setCount(highRiskMachines.size());
        kpis.add(kpiHighRisk);


        List<MachineDefinition> machines = machineService.getMachineDefinitions();
        KPIData kpiTotalScannedMachines = new KPIData(KPIType.TOTAL_SCANNED_MACHINES);
        kpiTotalScannedMachines.setName("Machines Scanned");
        kpiTotalScannedMachines.setCount(machines.size());
        kpis.add(kpiTotalScannedMachines);

        ModuleMetaFilter moduleFilter = new ModuleMetaFilter();
        moduleFilter.setPageSize(100);
        List<ModuleMeta> modules = moduleService.getModuleMetas(moduleFilter);
        KPIData kpiModuleCount = new KPIData(KPIType.TOTAL_SCANNED_MODULES);
        kpiModuleCount.setName("Unsigned Modules");
        kpiModuleCount.setCount(modules.size());
        kpis.add(kpiModuleCount);

        KPIData machineOffLineCount = new KPIData(KPIType.OFFLINE_MACHINES);
        machineOffLineCount.setName("Machines Offline");
        List<MachineDefinition> offLineMachines = machines.stream()
                .filter(p -> !p.getOnline()).collect(Collectors.toList());
        machineOffLineCount.setCount(offLineMachines.size());
        kpis.add(machineOffLineCount);

        Map<String, List<KPIData>> map = new HashMap<>();
        map.put("kpi", kpis);
        return map;
    }*/
}
