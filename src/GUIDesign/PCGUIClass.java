package GUIDesign;

import controls.ConfigApplication;
import g4p_controls.*;
import processing.core.PApplet;
/**
 * Import all lines from gui.pde into this class after any GUI change
 * Do no other changes here.
 * 
 * @author WISS
 *
 */
public abstract class PCGUIClass extends ConfigApplication {

/* =========================================================
 * ====                   WARNING                        ===
 * =========================================================
 * The code in this tab has been generated from the GUI form
 * designer and care should be taken when editing this file.
 * Only add/edit code inside the event handlers i.e. only
 * use lines between the matching comment tags. e.g.

 void myBtnEvents(GButton button) { //_CODE_:button1:12356:
     // It is safe to enter your event code here  
 } //_CODE_:button1:12356:
 
 * Do not rename this tab!
 * =========================================================
 */

public void button1_click1(GButton source, GEvent event) { //_CODE_:button1:575168:
  println("button1 - GButton >> GEvent." + event + " @ " + millis());
} //_CODE_:button1:575168:

public void panel1_Click1(GPanel source, GEvent event) { //_CODE_:panel1:333298:
  println("panel1 - GPanel >> GEvent." + event + " @ " + millis());
} //_CODE_:panel1:333298:

public void textarea1_change1(GTextArea source, GEvent event) { //_CODE_:textarea1:406069:
  println("textarea1 - GTextArea >> GEvent." + event + " @ " + millis());
} //_CODE_:textarea1:406069:

public void button4_click1(GButton source, GEvent event) { //_CODE_:button4:206151:
  println("button4 - GButton >> GEvent." + event + " @ " + millis());
} //_CODE_:button4:206151:

public void button2_click1(GButton source, GEvent event) { //_CODE_:button2:655042:
  println("button2 - GButton >> GEvent." + event + " @ " + millis());
} //_CODE_:button2:655042:

public void button5_click1(GButton source, GEvent event) { //_CODE_:button5:222117:
  println("button5 - GButton >> GEvent." + event + " @ " + millis());
} //_CODE_:button5:222117:

synchronized public void win_draw2(PApplet appc, GWinData data) { //_CODE_:NextWindow:575316:
  appc.background(230);
} //_CODE_:NextWindow:575316:

public void textarea2_change1(GTextArea source, GEvent event) { //_CODE_:textarea2:302526:
  println("textarea2 - GTextArea >> GEvent." + event + " @ " + millis());
} //_CODE_:textarea2:302526:

public void button3_click1(GButton source, GEvent event) { //_CODE_:button3:563826:
  println("button3 - GButton >> GEvent." + event + " @ " + millis());
} //_CODE_:button3:563826:



// Create all the GUI controls. 
// autogenerated do not edit
public void createGUI(){
  G4P.messagesEnabled(false);
  G4P.setGlobalColorScheme(GCScheme.BLUE_SCHEME);
  G4P.setCursor(ARROW);
  surface.setTitle("HelloWorld by H.Lucca");
  button1 = new GButton(this, 292, 116, 80, 30);
  button1.setText("Send...");
  button1.addEventHandler(this, "button1_click1");
  label1 = new GLabel(this, 281, 56, 103, 42);
  label1.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label1.setText("Testing the GUI...");
  label1.setOpaque(false);
  panel1 = new GPanel(this, 50, 46, 165, 130, "Output");
  panel1.setText("Output");
  panel1.setOpaque(true);
  panel1.addEventHandler(this, "panel1_Click1");
  textarea1 = new GTextArea(this, 2, 25, 160, 101, G4P.SCROLLBARS_NONE);
  textarea1.setOpaque(true);
  textarea1.addEventHandler(this, "textarea1_change1");
  button4 = new GButton(this, 242, 173, 80, 30);
  button4.setText("Face text");
  button4.addEventHandler(this, "button4_click1");
  panel1.addControl(textarea1);
  panel1.addControl(button4);
  button2 = new GButton(this, 291, 166, 80, 30);
  button2.setText("Next");
  button2.addEventHandler(this, "button2_click1");
  button5 = new GButton(this, 72, 217, 80, 32);
  button5.setText("Face text");
  button5.addEventHandler(this, "button5_click1");
  NextWindow = GWindow.getWindow(this, "Window title", 0, 0, 240, 120, JAVA2D);
  NextWindow.noLoop();
  NextWindow.addDrawHandler(this, "win_draw2");
  textarea2 = new GTextArea(NextWindow, 10, 11, 119, 80, G4P.SCROLLBARS_NONE);
  textarea2.setOpaque(true);
  textarea2.addEventHandler(this, "textarea2_change1");
  button3 = new GButton(NextWindow, 142, 35, 80, 30);
  button3.setText("EXIT");
  button3.addEventHandler(this, "button3_click1");
  NextWindow.loop();
}

// Variable declarations 
// autogenerated do not edit
GButton button1; 
GLabel label1; 
GPanel panel1; 
GTextArea textarea1; 
GButton button4; 
GButton button2; 
GButton button5; 
GWindow NextWindow;
GTextArea textarea2; 
GButton button3; 

}
