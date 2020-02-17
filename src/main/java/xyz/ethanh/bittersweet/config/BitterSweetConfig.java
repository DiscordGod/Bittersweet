package xyz.ethanh.bittersweet.config;

public class BitterSweetConfig {

    private final ConfigGeneral general = new ConfigGeneral();

    public ConfigGeneral getGeneral() {
        return general;
    }

    public static class ConfigGeneral {
        private boolean sprintToggled = false;
        private boolean fullbrightToggled = false;
        private boolean flyToggled = false;
        private boolean noFallToggled = false;
        private boolean keysToggled = false;
        private boolean armorStatusToggled = false;
        private boolean coordsToggled = false;
        private boolean cheats = true;

        public boolean isSprintToggled() {
            return sprintToggled;
        }

        public void setSprintToggled(boolean sprintToggled) {
            this.sprintToggled = sprintToggled;
        }

        public boolean isFullbrightToggled() {
            return fullbrightToggled;
        }

        public void setFullbrightToggled(boolean fullbrightToggled) {
            this.fullbrightToggled = fullbrightToggled;
        }

        public boolean isFlyToggled() {
            return flyToggled;
        }

        public void setFlyToggled(boolean flyToggled) {
            this.flyToggled = flyToggled;
        }

        public void setNoFallToggled(boolean noFallToggled) {
            this.noFallToggled = noFallToggled;
        }

        public boolean isNoFallToggled() {
            return noFallToggled;
        }

        public void setKeysToggled(boolean keysToggled) {
            this.keysToggled = keysToggled;
        }

        public boolean isKeysToggled() {
            return keysToggled;
        }

        public void setArmorStatusToggled(boolean armorStatusToggled) {
            this.armorStatusToggled = armorStatusToggled;
        }

        public boolean isArmorStatusToggled() {
            return armorStatusToggled;
        }

        public void setCoordsToggled(boolean coordsToggled) {
            this.coordsToggled = coordsToggled;
        }

        public boolean isCoordsToggled() {
            return coordsToggled;
        }

        public boolean areCheatsToggled() {
            return cheats;
        }

    }

}
