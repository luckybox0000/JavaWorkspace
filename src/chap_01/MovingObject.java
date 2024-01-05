package chap_01;

import javax.swing.*;
import java.awt.*;

public class MovingObject extends JPanel {
    private int x; // 물체의 x 좌표

    public MovingObject() {
        x = 0; // 초기 x 좌표는 0으로 설정
    }

    public void moveRight() {
        x += 5; // 오른쪽으로 5픽셀씩 이동
        repaint(); // 화면 갱신을 위해 다시 그리기
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x, 50, 50, 50); // 물체를 그림
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Object");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        MovingObject movingObject = new MovingObject();

        JButton moveButton = new JButton("Move Right");
        moveButton.addActionListener(e -> movingObject.moveRight());

        frame.add(movingObject, BorderLayout.CENTER);
        frame.add(moveButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
