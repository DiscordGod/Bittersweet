package xyz.ethanh.bittersweet.module;

import java.util.ArrayList;

import xyz.ethanh.bittersweet.module.modules.*;

public class ModuleManager {
    public ArrayList<Module> moduleList = new ArrayList();
    public Sprint sprint;
    public Fullbright fullbright;

    public void init() {
        sprint = new Sprint();
        fullbright = new Fullbright();
        moduleList.add(sprint);
        moduleList.add(fullbright);
    }

    public ArrayList<Module> getEnabledModules() {
        ArrayList<Module> toggledModules = new ArrayList();
        for (Module module : moduleList) {
            if (module.isEnabled()) {
                toggledModules.add(module);
            }
        }
        return toggledModules;
    }

    public ArrayList<Module> getDisabledModules() {
        ArrayList<Module> unToggledModules = new ArrayList();
        for (Module module : moduleList) {
            if (!module.isEnabled()) {
                unToggledModules.add(module);
            }
        }
        return unToggledModules;
    }    
}