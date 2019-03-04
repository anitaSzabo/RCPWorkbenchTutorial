package org.o7planning.tutorial.rcp.editor;
 
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
 
public class UserEditor extends EditorPart {
 
 public static final String ID = "org.o7planning.tutorial.rcp.editor.user";
 private Table table;
 
 public UserEditor() {
 
 }
 
 @Override
 public void doSave(IProgressMonitor monitor) {
 
 }
 
 @Override
 public void doSaveAs() {
 
 }
 
 /**
  * Important!!!
  */
 @Override
 public void init(IEditorSite site, IEditorInput input)
         throws PartInitException {
     if (!(input instanceof UserEditorInput)) {
         throw new PartInitException("Invalid Input: Must be "
                 + UserEditorInput.class.getName());
     }
     setSite(site);
     setInput(input);
 }
 
 @Override
 public boolean isDirty() {
     return false;
 }
 
 @Override
 public boolean isSaveAsAllowed() {
     return false;
 }
 
 @Override
 public void createPartControl(Composite parent) {
     // Add Code.
     // If you want to design with WindowBuilder Designer
     // Change code like:  (Important!!!)
     parent.setLayout(new FillLayout());
     Composite body = new Composite(parent, SWT.NONE);
     
     table = new Table(body, SWT.BORDER | SWT.FULL_SELECTION);
     table.setBounds(172, 121, 247, 240);
     table.setHeaderVisible(true);
     table.setLinesVisible(true);
     
     TableItem tableItem_1 = new TableItem(table, SWT.NONE);
     tableItem_1.setText("New TableItem");
     
     TableItem tableItem = new TableItem(table, SWT.NONE);
     tableItem.setText("New TableItem");
 }
 
 @Override
 public void setFocus() {
 
 }
}