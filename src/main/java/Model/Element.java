package Model;

import Constants.PositionType;

public class Element {

    public enum SelectorType{
        ID,
        XPATH,
        PARTIAL_ID,
        TEXT
    }

    public enum DriverType{
        APPIUM,
        SELENIUM
    }

    public class ElementAbilities {

        // abilities
        private boolean clickable;
        private boolean hasText;
        private boolean redirects;
        private String redirectsToPom;

        public boolean isClickable() {
            return clickable;
        }

        public void setClickable(boolean clickable) {
            this.clickable = clickable;
        }

        public boolean isHasText() {
            return hasText;
        }

        public void setHasText(boolean hasText) {
            this.hasText = hasText;
        }

        public boolean isRedirects() {
            return redirects;
        }

        public void setRedirects(boolean redirects) {
            this.redirects = redirects;
        }

        public String getRedirectsToPom() {
            return redirectsToPom;
        }

        public void setRedirectsToPom(String redirectsToPom) {
            this.redirectsToPom = redirectsToPom;
        }
    }

    public class Position {

        private PositionType topLeftCornerPT;
        private int topLeftCornerValue;
        private PositionType heightPT;
        private int heightValue;
        private PositionType lenghtPT;
        private int lengthValue;

        public PositionType getTopLeftCornerPT() {
            return topLeftCornerPT;
        }

        public void setTopLeftCornerPT(PositionType topLeftCornerPT) {
            this.topLeftCornerPT = topLeftCornerPT;
        }

        public int getTopLeftCornerValue() {
            return topLeftCornerValue;
        }

        public void setTopLeftCornerValue(int topLeftCornerValue) {
            this.topLeftCornerValue = topLeftCornerValue;
        }

        public PositionType getHeightPT() {
            return heightPT;
        }

        public void setHeightPT(PositionType heightPT) {
            this.heightPT = heightPT;
        }

        public int getHeightValue() {
            return heightValue;
        }

        public void setHeightValue(int heightValue) {
            this.heightValue = heightValue;
        }

        public PositionType getLenghtPT() {
            return lenghtPT;
        }

        public void setLenghtPT(PositionType lenghtPT) {
            this.lenghtPT = lenghtPT;
        }

        public int getLengthValue() {
            return lengthValue;
        }

        public void setLengthValue(int lengthValue) {
            this.lengthValue = lengthValue;
        }
    }

    // required fields
    private String name;
    private SelectorType selectorType;
    private String selectorValue;
    private DriverType requiredDriver;

    private ElementAbilities abilities;

    // optional fields
    private String imagePath;

    private Position position;

    public ElementAbilities getAbilities() {
        return abilities;
    }

    public void setAbilities(ElementAbilities abilities) {
        this.abilities = abilities;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SelectorType getSelectorType() {
        return selectorType;
    }

    public void setSelectorType(SelectorType selectorType) {
        this.selectorType = selectorType;
    }

    public String getSelectorValue() {
        return selectorValue;
    }

    public void setSelectorValue(String selectorValue) {
        this.selectorValue = selectorValue;
    }

    public DriverType getRequiredDriver() {
        return requiredDriver;
    }

    public void setRequiredDriver(DriverType requiredDriver) {
        this.requiredDriver = requiredDriver;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
