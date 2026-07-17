import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame {

    JLabel clockLabel;

    DigitalClock() {
        setTitle("Digital Clock");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        clockLabel = new JLabel();
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clockLabel.setFont(new Font("Arial", Font.BOLD, 50));
        clockLabel.setForeground(Color.GREEN);
        clockLabel.setBackground(Color.BLACK);
        clockLabel.setOpaque(true);

        add(clockLabel);

        Timer timer = new Timer(1000, e -> {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
            clockLabel.setText(sdf.format(new Date()));
        });
        timer.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new DigitalClock();
    }
}