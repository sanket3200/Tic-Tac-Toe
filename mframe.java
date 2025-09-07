import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mframe extends Frame implements ActionListener {
    int c = 1;
    Color empty = new Color(250, 250, 230);
    Color occ = new Color(250, 250, 210);
    Color fColor = new Color(250, 250, 220);
    Font bf = new Font("Verdana", Font.BOLD, 40);
    Button b1 = new Button("");
    Button b2 = new Button("");
    Button b3 = new Button("");
    Button b4 = new Button("");
    Button b5 = new Button("");
    Button b6 = new Button("");
    Button b7 = new Button("");
    Button b8 = new Button("");
    Button b9 = new Button("");


    mframe() {
        setSize(600, 500);
        setLocationRelativeTo(null);
        setTitle("XO");
        setLayout(new GridLayout(3, 3));

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        b1.addFocusListener(new focusHandler());
        b2.addFocusListener(new focusHandler());
        b3.addFocusListener(new focusHandler());
        b4.addFocusListener(new focusHandler());
        b5.addFocusListener(new focusHandler());
        b6.addFocusListener(new focusHandler());
        b7.addFocusListener(new focusHandler());
        b8.addFocusListener(new focusHandler());
        b9.addFocusListener(new focusHandler());

        b1.setBackground(empty);
        b2.setBackground(empty);
        b3.setBackground(empty);
        b4.setBackground(empty);
        b5.setBackground(empty);
        b6.setBackground(empty);
        b7.setBackground(empty);
        b8.setBackground(empty);
        b9.setBackground(empty);

        b1.setFont(bf);
        b2.setFont(bf);
        b3.setFont(bf);
        b4.setFont(bf);
        b5.setFont(bf);
        b6.setFont(bf);
        b7.setFont(bf);
        b8.setFont(bf);
        b9.setFont(bf);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    class focusHandler extends FocusAdapter {
        public void focusGained(FocusEvent e) {
            Button bu = (Button) e.getComponent();
            bu.setBackground(fColor);
        }

        public void focusLost(FocusEvent e) {
            Button bu = (Button) e.getComponent();
            if (bu.getLabel() == "X" || bu.getLabel() == "O") {
                bu.setBackground(occ);
            } else {
                bu.setBackground(empty);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {

        Object ref = e.getSource();
        c++;
        if (ref == b1) {
            if ((b1.getLabel()) == "X" || (b1.getLabel()) == "O") {
                c--;
            } else {
                if ((c % 2) == 0) {
                    b1.setLabel("X");
                } else {
                    b1.setLabel("O");
                }
                b1.setBackground(occ);

            }
        }

        if (ref == b2) {
            if ((b2.getLabel()) == "X" || (b2.getLabel()) == "O") {
                c--;
            } else {
                if ((c % 2) == 0) {
                    b2.setLabel("X");
                } else {
                    b2.setLabel("O");
                }
                b2.setBackground(occ);

            }
        }

        if (ref == b3) {
            if ((b3.getLabel()) == "X" || (b3.getLabel()) == "O") {
                c--;
            } else {
                if ((c % 2) == 0) {
                    b3.setLabel("X");
                } else {
                    b3.setLabel("O");
                }
                b3.setBackground(occ);

            }
        }

        if (ref == b4) {
            if ((b4.getLabel()) == "X" || (b4.getLabel()) == "O") {
                c--;
            } else {
                if ((c % 2) == 0) {
                    b4.setLabel("X");
                } else {
                    b4.setLabel("O");
                }
                b4.setBackground(occ);

            }
        }

        if (ref == b5) {
            if ((b5.getLabel()) == "X" || (b5.getLabel()) == "O") {
                c--;
            } else {
                if ((c % 2) == 0) {
                    b5.setLabel("X");
                } else {
                    b5.setLabel("O");
                }
                b5.setBackground(occ);

            }
        }

        if (ref == b6) {
            if ((b6.getLabel()) == "X" || (b6.getLabel()) == "O") {
                c--;
            } else {
                if ((c % 2) == 0) {
                    b6.setLabel("X");
                } else {
                    b6.setLabel("O");
                }
                b6.setBackground(occ);

            }
        }

        if (ref == b7) {
            if ((b7.getLabel()) == "X" || (b7.getLabel()) == "O") {
                c--;
            } else {
                if ((c % 2) == 0) {
                    b7.setLabel("X");
                } else {
                    b7.setLabel("O");
                }
                b7.setBackground(occ);

            }
        }

        if (ref == b8) {
            if ((b8.getLabel()) == "X" || (b8.getLabel()) == "O") {
                c--;
            } else {
                if ((c % 2) == 0) {
                    b8.setLabel("X");
                } else {
                    b8.setLabel("O");
                }
                b8.setBackground(occ);

            }
        }

        if (ref == b9) {
            if ((b9.getLabel()) == "X" || (b9.getLabel()) == "O") {
                c--;
            } else {
                if ((c % 2) == 0) {
                    b9.setLabel("X");
                } else {
                    b9.setLabel("O");
                }
                b9.setBackground(occ);

            }
        }

        if ((b1.getLabel().equals("X") && b2.getLabel().equals("X") && b3.getLabel().equals("X")) ||
                (b4.getLabel().equals("X") && b5.getLabel().equals("X") && b6.getLabel().equals("X")) ||
                (b7.getLabel().equals("X") && b8.getLabel().equals("X") && b9.getLabel().equals("X")) ||
                (b1.getLabel().equals("X") && b4.getLabel().equals("X") && b7.getLabel().equals("X")) ||
                (b2.getLabel().equals("X") && b5.getLabel().equals("X") && b8.getLabel().equals("X")) ||
                (b3.getLabel().equals("X") && b6.getLabel().equals("X") && b9.getLabel().equals("X")) ||
                (b1.getLabel().equals("X") && b5.getLabel().equals("X") && b9.getLabel().equals("X")) ||
                (b7.getLabel().equals("X") && b5.getLabel().equals("X") && b3.getLabel().equals("X"))) {

            JOptionPane.showMessageDialog(null, "Player X Wins!");
            int a = JOptionPane.showConfirmDialog(null, "Play Again ?", "", 2, 3);
            if (a == JOptionPane.YES_OPTION) {
                resetGame();
            } else {
                System.exit(0);
            }
        }

        if ((b1.getLabel().equals("O") && b2.getLabel().equals("O") && b3.getLabel().equals("O")) ||
                (b4.getLabel().equals("O") && b5.getLabel().equals("O") && b6.getLabel().equals("O")) ||
                (b7.getLabel().equals("O") && b8.getLabel().equals("O") && b9.getLabel().equals("O")) ||
                (b1.getLabel().equals("O") && b4.getLabel().equals("O") && b7.getLabel().equals("O")) ||
                (b2.getLabel().equals("O") && b5.getLabel().equals("O") && b8.getLabel().equals("O")) ||
                (b3.getLabel().equals("O") && b6.getLabel().equals("O") && b9.getLabel().equals("O")) ||
                (b1.getLabel().equals("O") && b5.getLabel().equals("O") && b9.getLabel().equals("O")) ||
                (b7.getLabel().equals("O") && b5.getLabel().equals("O") && b3.getLabel().equals("O"))) {
            JOptionPane.showMessageDialog(null, "Player O Wins!");
            int a = JOptionPane.showConfirmDialog(null, "Play Again ?", "", 2, 3);
            if (a == JOptionPane.YES_OPTION) {
                resetGame();
            } else {
                System.exit(0);
            }
        }

        if ((b1.getLabel().equals("X") || b1.getLabel().equals("O"))
                && (b2.getLabel().equals("X") || b2.getLabel().equals("O"))
                && (b3.getLabel().equals("X") || b3.getLabel().equals("O"))
                && (b4.getLabel().equals("X") || b4.getLabel().equals("O"))
                && (b5.getLabel().equals("X") || b5.getLabel().equals("O"))
                && (b6.getLabel().equals("X") || b6.getLabel().equals("O"))
                && (b7.getLabel().equals("X") || b7.getLabel().equals("O"))
                && (b8.getLabel().equals("X") || b8.getLabel().equals("O"))
                && (b9.getLabel().equals("X") || b9.getLabel().equals("O"))) {
            JOptionPane.showMessageDialog(null, "Game Tied");
            int a = JOptionPane.showConfirmDialog(null, "Play Again ?", "", 2, 3);
            if (a == JOptionPane.YES_OPTION) {
                resetGame();
            } else {
                System.exit(0);
            }

        }

    }

    public static void main(String args[]) {
        mframe f = new mframe();
        f.setVisible(true);
    }

    public void resetGame() {
        b1.setLabel("");
        b2.setLabel("");
        b3.setLabel("");
        b4.setLabel("");
        b5.setLabel("");
        b6.setLabel("");
        b7.setLabel("");
        b8.setLabel("");
        b9.setLabel("");
        b1.setBackground(empty);
        b2.setBackground(empty);
        b3.setBackground(empty);
        b4.setBackground(empty);
        b5.setBackground(empty);
        b6.setBackground(empty);
        b7.setBackground(empty);
        b8.setBackground(empty);
        b9.setBackground(empty);
        c = 1;
    }
}