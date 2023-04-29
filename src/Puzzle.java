import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Puzzle extends JButton {
    private boolean isLastButton;

    public Puzzle() {
        super();
        initUI();
    }

    public Puzzle(Image i) {
        super(new ImageIcon(i));
        initUI();
    }

    private void initUI() {
        isLastButton = false;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.yellow));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.gray));
            }
        });
    }

    public boolean isLastButton() {
        return isLastButton;
    }

    public void setLastButton(boolean lastButton) {
        this.isLastButton = isLastButton;
    }
}
