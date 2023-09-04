package de.vepexlegit.noscoreboarddebug;

public enum NoScoreBoard {
    INSTANCE;

    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
