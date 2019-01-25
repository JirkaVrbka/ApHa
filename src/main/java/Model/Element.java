package Model;

import Constants.PositionType;

import java.util.List;

public class Element {

    // required fields
    private String name;
    private String selector;
    private String selectorString;
    private String requiredDriver;
    private List<String> pom;

    // optional fields
    private String imagePath;
    private PositionType topLeftCornerPT;
    private int topLeftCornerValue;
    private PositionType heightPT;
    private int heightValue;
    private PositionType lenghtPT;
    private int lengthValue;

    // abilities
    private boolean clickable;
    private boolean hasText;
    private boolean redirects;
    private String redirectsToPom;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String getSelectorString() {
        return selectorString;
    }

    public void setSelectorString(String selectorString) {
        this.selectorString = selectorString;
    }

    public String getRequiredDriver() {
        return requiredDriver;
    }

    public void setRequiredDriver(String requiredDriver) {
        this.requiredDriver = requiredDriver;
    }

    public List<String> getPom() {
        return pom;
    }

    public void setPom(List<String> pom) {
        this.pom = pom;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

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
