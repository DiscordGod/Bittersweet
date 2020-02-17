package xyz.ethanh.bittersweet.utils;

import xyz.ethanh.bittersweet.BitterSweet;

public class YHelper {

    public static float y (String render) {
        switch (render) {
            case "fps":
                return 1;
            case "xyz":
                return 15;
            case "keysW":
                if (BitterSweet.CONFIG.get().getGeneral().isCoordsToggled()) {
                    return 16 - 3;
                } else {
                    return 9 - 3;
                }
            case "keysA":
                if (BitterSweet.CONFIG.get().getGeneral().isCoordsToggled()) {
                    return 27 - 3;
                } else {
                    return 20 - 3;
                }
            case "keysS":
                if (BitterSweet.CONFIG.get().getGeneral().isCoordsToggled()) {
                    return 27 - 3;
                } else {
                    return 20 - 3;
                }
            case "keysD":
                if (BitterSweet.CONFIG.get().getGeneral().isCoordsToggled()) {
                    return 27 - 3;
                } else {
                    return 20 - 3;
                }
            case "sprintorcps":
                if (BitterSweet.CONFIG.get().getGeneral().isCoordsToggled()) {
                    if (BitterSweet.CONFIG.get().getGeneral().isKeysToggled()) {
                        return 75 - 4;
                    } else {
                        return 45 - 15;
                    }
                } else {
                    if (BitterSweet.CONFIG.get().getGeneral().isKeysToggled()) {
                        return 60 - 4;
                    } else {
                        return 30 - 15;
                    }
                }
            case "swinging":
                if (BitterSweet.CONFIG.get().getGeneral().isCoordsToggled()) {
                    if (BitterSweet.CONFIG.get().getGeneral().isKeysToggled()) {
                        return 90 - 5;
                    } else {
                        return 60 - 15;
                    }
                } else {
                    if (BitterSweet.CONFIG.get().getGeneral().isKeysToggled()) {
                        return 75 - 5;
                    } else {
                        return 45 - 15;
                    }
                }
            case "armorHelm":
                if (BitterSweet.CONFIG.get().getGeneral().isCoordsToggled()) {
                    if (BitterSweet.CONFIG.get().getGeneral().isKeysToggled()) {
                        return 105 - 5;
                    } else {
                        return 75 - 15;
                    }
                } else {
                    if (BitterSweet.CONFIG.get().getGeneral().isKeysToggled()) {
                        return 90 - 5;
                    } else {
                        return 60 - 15;
                    }
                }
            case "armorChest":
                if (BitterSweet.CONFIG.get().getGeneral().isCoordsToggled()) {
                    if (BitterSweet.CONFIG.get().getGeneral().isKeysToggled()) {
                        return 120 - 5;
                    } else {
                        return 90 - 15;
                    }
                } else {
                    if (BitterSweet.CONFIG.get().getGeneral().isKeysToggled()) {
                        return 105 - 5;
                    } else {
                        return 75 - 15;
                    }
                }
            case "armorLeggings":
                if (BitterSweet.CONFIG.get().getGeneral().isCoordsToggled()) {
                    if (BitterSweet.CONFIG.get().getGeneral().isKeysToggled()) {
                        return 135 - 5;
                    } else {
                        return 105 - 15;
                    }
                } else {
                    if (BitterSweet.CONFIG.get().getGeneral().isKeysToggled()) {
                        return 120 - 5;
                    } else {
                        return 90 - 15;
                    }
                }
            case "armorBoots":
                if (BitterSweet.CONFIG.get().getGeneral().isCoordsToggled()) {
                    if (BitterSweet.CONFIG.get().getGeneral().isKeysToggled()) {
                        return 150 - 5;
                    } else {
                        return 120 - 15;
                    }
                } else {
                    if (BitterSweet.CONFIG.get().getGeneral().isKeysToggled()) {
                        return 135 - 5;
                    } else {
                        return 105 - 15;
                    }
                }
        }
        return 0;
    }

}