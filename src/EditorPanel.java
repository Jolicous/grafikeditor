import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
final class EditorPanel extends JPanel {
  private EditorControl editorControl;

  final private class EditorMouseAdapter extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) {
      editorControl.setErsterPunkt(e.getPoint());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      editorControl.erzeugeFigurMitZweitemPunkt(e.getPoint());
      repaint();
    }
  }

  final private class EditorKeyAdapter extends KeyAdapter{
    @Override
    public void keyPressed(KeyEvent e) {
      editorControl.setFigurTyp(e.getKeyChar());
    }
  }


  EditorPanel(EditorControl control) {
    editorControl = control;
    addMouseListener(new EditorMouseAdapter());
    addKeyListener(new EditorKeyAdapter());
    setFocusable(true);
    requestFocusInWindow();
  }

  // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
  // Methode beim EditorFrame oder beim EditorPanel aufruft.
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    editorControl.allesNeuZeichnen(g);
  }
}