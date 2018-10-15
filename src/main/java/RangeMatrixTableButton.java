

import java.awt.image.BufferedImage;
import java.util.Objects;
import java.util.Stack;

/**
 *
 * @author daniil_pozdeev
 */
public class RangeMatrixTableButton {
    
    private int column;
    private int row;
    private int currentRow;
    private double x;
    private double y;
    private double width;
    private double height;
    private final Object buttonObject;
    private String buttonName;
    private BufferedImage img;
    private boolean collapsedByColumn;
    private boolean collapsedByRow;
    private boolean leadingByColumn;
    private boolean leadingByRow;
    private final Stack<Boolean> notEmptyInColumnStack;
    private final Stack<Boolean> notEmptyInRowStack;
    private boolean entered;
    private int indexInTable;
    
    public RangeMatrixTableButton(Object buttonObject) {
        this.buttonObject = buttonObject;
        notEmptyInColumnStack = new Stack<>();
        notEmptyInRowStack = new Stack<>();
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
    
    //Buffered Image of Cell

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }
    
    //Collapse Methods

    public boolean isCollapsedByColumn() {
        return collapsedByColumn;
    }

    public void setCollapsedByColumn(boolean collapsedByColumn) {
        this.collapsedByColumn = collapsedByColumn;
    }

    public boolean isCollapsedByRow() {
        return collapsedByRow;
    }

    public void setCollapsedByRow(boolean collapsedByRow) {
        this.collapsedByRow = collapsedByRow;
    }
    
    public boolean isCollapsed() {
        return collapsedByColumn || collapsedByRow;
    }
    
    //Leading Methods

    public boolean isLeadingByColumn() {
        return leadingByColumn;
    }

    public void setLeadingByColumn(boolean leadingByColumn) {
        this.leadingByColumn = leadingByColumn;
    }

    public boolean isLeadingByRow() {
        return leadingByRow;
    }

    public void setLeadingByRow(boolean leadingByRow) {
        this.leadingByRow = leadingByRow;
    }
    
    public boolean isLeading() {
        return leadingByColumn || leadingByRow;
    }
    
    //Object of Button

    public Object getButtonObject() {
        return buttonObject;
    }
    
    //Check for significant values under collapsed column or row

    public Stack<Boolean> getNotEmptyInColumnStack() {
        return notEmptyInColumnStack;
    }

    public Stack<Boolean> getNotEmptyInRowStack() {
        return notEmptyInRowStack;
    }

    public boolean isEntered() {
        return entered;
    }

    public void setEntered(boolean entered) {
        this.entered = entered;
    }

    public int getIndexInTable() {
        return indexInTable;
    }

    public void setIndexInTable(int indexInTable) {
        this.indexInTable = indexInTable;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }
}