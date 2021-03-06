package ml.kanfa.engine;

import java.awt.*;
import java.io.Serializable;

/**
 * @uthor Ibrahim Maïga.
 */

public abstract class CellConfig implements Serializable, Cloneable{

    private static final long serialVersionUID = 1L;

    public abstract Color getBackground(int value);

    public Color getForeground(int value){
        switch (value){
            case 2:
            case 4:
                return Color.BLACK;
            default: return Color.WHITE;
        }
    }

    public Font getFont(int value){
        return new Font("Verdana", Font.PLAIN, 30 - (String.valueOf(value).length() * 2));
    }

    public CellConfig clone() throws CloneNotSupportedException {
        return (CellConfig)super.clone();
    }
}
