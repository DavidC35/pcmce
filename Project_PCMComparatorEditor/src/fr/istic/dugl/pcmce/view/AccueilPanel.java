package fr.istic.dugl.pcmce.view;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import fr.istic.dugl.pcmce.shared.FieldVerifier;

public class AccueilPanel extends VerticalPanel{

	FlexTable table = new FlexTable();
	
	static final int NAME_COLUMN = 1;
	
	public AccueilPanel() {
		this.add(table);
	}
	
	public void AccueilPanelInit(){
	
	final Label lblSelectFile = new Label("Enter File's url: ");
	final TextBox txtLoadFile = new TextBox();
	final Label lblSelectFileBrowse = new Label("or browse it: ");
	final FileUpload browseBtn = new FileUpload();
	final Button loadBtn = new Button("Load");
	txtLoadFile.setText("Enter your URL here");
	final Label errorLbl = new Label();
	final TabLayoutPanel panel = new TabLayoutPanel(35, Unit.PX);
	VerticalPanel loadFilePanel = new VerticalPanel();
	VerticalPanel verticaltabPanel = new VerticalPanel();
	/*
	loadFilePanel.addStyleName("verticalLoadPanelContainer");
	verticaltabPanel.addStyleName("verticalTabPanelContainer");
	
	// We can add style names to widgets
	loadBtn.addStyleName("loadBtn");

	browseBtn.setName("fileUpload");

	// Add the txtLoadFile and loadBtn to the RootLayoutPanel
	// Use RootLayoutPanel.get() to get the entire body element
	/*
	RootLayoutPanel.get("fileFieldContainer").add(txtLoadFile);
	RootLayoutPanel.get("loadBtnContainer").add(loadBtn);
	RootLayoutPanel.get("browseBtnContainer").add(browseBtn);
	RootLayoutPanel.get("errorLblContainer").add(errorLbl);
	 */
	/*
	Widget loadFilePanelWidget;
	
	loadFilePanel.add(lblSelectFile);
	loadFilePanel.add(txtLoadFile);
	loadFilePanel.add(lblSelectFileBrowse);
	loadFilePanel.add(browseBtn);
	loadFilePanel.add(loadBtn);
	*/
	/*
	// Focus the cursor on the name field when the app loads
	txtLoadFile.setFocus(true);
	txtLoadFile.selectAll();
	*/
	/*
	String text1 = "Lorem ipsum dolor sit amet...";
	String text2 = "Sed egestas, arcu nec accumsan...";
	String text3 = "Proin tristique, elit at blandit...";
	
	FlowPanel flowpanel;

	flowpanel = new FlowPanel();
	flowpanel.add(new Label(text1));
	panel.add(flowpanel, "One");

	flowpanel = new FlowPanel();
	flowpanel.add(new Label(text2));
	panel.add(flowpanel, "Two");

	flowpanel = new FlowPanel();
	flowpanel.add(new Label(text3));
	panel.add(flowpanel, "Three");

	panel.selectTab(0);

	panel.setSize("1000px", "600px");
	panel.addStyleName("table-center");
	panel.setVisible(false);
//	RootLayoutPanel.get("verticalTabPanelContainer").add(panel); 
	
	
	
	
	LayoutPanel appPanel = new LayoutPanel();
	appPanel.add(loadFilePanel);
	/*
	appPanel.setWidgetLeftWidth(loadFilePanelWidget, 0, Unit.PCT, 100, Unit.PCT);  // top panel
	appPanel.setWidgetTopBottom(loadFilePanelWidget, 0, Unit.PCT, 50, Unit.PCT);
	*/
	/*
	RootLayoutPanel.get().add(appPanel);
	
	
	// Create the popup dialog box
	final DialogBox dialogBox = new DialogBox();
	dialogBox.setText("Remote Procedure Call");
	dialogBox.setAnimationEnabled(true);
	final Button closeButton = new Button("Close");
	// We can set the id of a widget by accessing its Element
	closeButton.getElement().setId("closeButton");
	final Label textToServerLabel = new Label();
	final HTML serverResponseLabel = new HTML();
	VerticalPanel dialogVPanel = new VerticalPanel();
	dialogVPanel.addStyleName("dialogVPanel");
	dialogVPanel.add(new HTML("<b>Sending name to the server:</b>"));
	dialogVPanel.add(textToServerLabel);
	dialogVPanel.add(new HTML("<br><b>Server replies:</b>"));
	dialogVPanel.add(serverResponseLabel);
	dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
	dialogVPanel.add(closeButton);
	dialogBox.setWidget(dialogVPanel);
	*/
	// Add a handler to close the DialogBox
	/*
	closeButton.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {
			dialogBox.hide();
			loadBtn.setEnabled(true);
			loadBtn.setFocus(true);
		}
	});

	// Create a handler for the loadBtn and nameField
	class MyHandler implements ClickHandler, KeyUpHandler {
		/**
		 * Fired when the user clicks on the loadBtn.
		 */
/*
		public void onClick(ClickEvent event) {
			sendNameToServer();
			panel.setVisible(true);
		}

		/**
		 * Fired when the user types in the nameField.
		 */
	/*
		public void onKeyUp(KeyUpEvent event) {
			if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
				sendNameToServer();
				panel.setVisible(true);
			}
		}

		/**
		 * Send the name from the nameField to the server and wait for a response.
		 */
	/*
		private void sendNameToServer() {
			// First, we validate the input.
			errorLbl.setText("");
			String fileUrl = txtLoadFile.getText();
			if (!FieldVerifier.isValidName(fileUrl)) {
				errorLbl.setText("Please enter an url");
				return;
			}

			// Then, we send the input to the server.
			loadBtn.setEnabled(false);
			textToServerLabel.setText(fileUrl);
			serverResponseLabel.setText("");
			greetingService.greetServer(fileUrl,
					new AsyncCallback<String>() {
						public void onFailure(Throwable caught) {
							// Show the RPC error message to the user
							dialogBox
									.setText("Remote Procedure Call - Failure");
							serverResponseLabel
									.addStyleName("serverResponseLabelError");
							serverResponseLabel.setHTML(SERVER_ERROR);
							dialogBox.center();
							closeButton.setFocus(true);
						}

						public void onSuccess(String result) {
							dialogBox.setText("Remote Procedure Call");
							serverResponseLabel
									.removeStyleName("serverResponseLabelError");
							serverResponseLabel.setHTML(result);
							dialogBox.center();
							closeButton.setFocus(true);
						}
					});
		}
	}

	// Add a handler to send the name to the server
	MyHandler handler = new MyHandler();
	loadBtn.addClickHandler(handler);
	txtLoadFile.addKeyUpHandler(handler);
	
	*/
	}
}
