package edu.iut.gui.widget.agenda;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;

import edu.iut.app.ApplicationSession;

public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	
	int selectedYear;
	int selectedMonth;
	int selectedDay;
	
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {

		
		Calendar c = Calendar.getInstance();
		
		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		this.selectedYear=c.get(Calendar.YEAR);
		this.selectedMonth=c.get(Calendar.MONTH);
		this.selectedDay=c.get(Calendar.DATE);
		
		
		
		
		/** EX3: REMPLACEMENT DU BOUTON NEXT */
		JButton nextView = new JButton(ApplicationSession.instance().getString("next"));
		nextView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				agendaViewLayout.next(contentPane);				
			}			
		});
		this.add(nextView);
	
		SpinnerNumberModel spinnerYear = new SpinnerNumberModel(selectedYear,selectedYear- 5,selectedYear + 5, 1);
		JSpinner year = new JSpinner(spinnerYear);
		this.add(year);
		
		String[] month ={"January","February","March","April","May","June","July","August","September","October","November","December"} ;
		JComboBox monthCombo = new JComboBox(month);
		monthCombo.setSelectedIndex(selectedMonth);
		this.add(monthCombo);
		
		String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
		JComboBox dayCombo = new JComboBox(day);
		dayCombo.setSelectedIndex(selectedDay);
		this.add(dayCombo);
	
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		JMenuItem menuItem;
		
		menuItem = new JMenuItem("Load");
		menu.add(menuItem);
		menuItem = new JMenuItem("Save");
		menu.add(menuItem);
		menuItem = new JMenuItem("Quit");
		menu.add(menuItem);
		
		JMenu edit = new JMenu("Edit");
		menuBar.add(edit);
		
		JMenu submenu = new JMenu("View");
		submenu.setMnemonic(KeyEvent.VK_S);
		
		edit.add(submenu);
		
	
		menuItem = new JMenuItem("Month");
		submenu.add(menuItem);

		menuItem = new JMenuItem("Week");
		submenu.add(menuItem);

		menuItem = new JMenuItem("Day");
		submenu.add(menuItem);
		
		JMenu help = new JMenu("Help");
		menuBar.add(help);
		menuItem = new JMenuItem("Display");
		help.add(menuItem);
		menuItem = new JMenuItem("About");
		help.add(menuItem);
		
		
		this.add(menuBar);
		

	}
	
	public int getYear() {
		return selectedYear;
	}
	public int getMonth() {
		return selectedMonth;
	}
	public int getDay() {
		return selectedDay;
	}
	
}
