package xyz.ethanh.bittersweet.module;

import java.util.ArrayList;

import xyz.ethanh.bittersweet.module.modules.*;

public class ModuleManager {
    public ArrayList<Module> moduleList = new ArrayList();
    public Sprint sprint;
    public Fullbright fullbright;
    public Fly fly;
    public NoFall nofall;
    public Keys keys;
    public ArmorStatus armorStatus;
    public Coords coords;

    public void init() {
        sprint = new Sprint();
        fullbright = new Fullbright();
        fly = new Fly();
        nofall = new NoFall();
        keys = new Keys();
        armorStatus = new ArmorStatus();
        coords = new Coords();
        moduleList.add(sprint);
        moduleList.add(fullbright);
        moduleList.add(fly);
        moduleList.add(nofall);
        moduleList.add(keys);
        moduleList.add(armorStatus);
        moduleList.add(coords);
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