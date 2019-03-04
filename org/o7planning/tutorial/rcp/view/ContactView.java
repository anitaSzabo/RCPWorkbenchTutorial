package org.o7planning.tutorial.rcp.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;

public class ContactView extends ViewPart {

	public ContactView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		Text text = new Text(parent, SWT.BORDER);
		
		Device device = Display.getCurrent ();
		Color red = new Color (device, 255, 0, 0);
	    Font font1 = new Font(device, "Tahoma", 14, SWT.BOLD);
		
		text.setBackground(red);
		text.setFont(font1);
        text.setText("It's a red view.");

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
