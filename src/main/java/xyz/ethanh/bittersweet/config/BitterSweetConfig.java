package xyz.ethanh.bittersweet.config;

public class BitterSweetConfig {

    private final ConfigGeneral general = new ConfigGeneral();

    public ConfigGeneral getGeneral() {
        return general;
    }

    public static class ConfigGeneral {
        private boolean sprintToggled = false;
        private boolean fullbrightToggled = false;

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
    }

}
