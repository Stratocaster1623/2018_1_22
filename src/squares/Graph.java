package squares;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph extends Frame implements ActionListener,WindowListener{
	
	public Graph(double value[]) {
		
		addWindowListener(this);
		setTitle("Squares");
		DefaultCategoryDataset data = new DefaultCategoryDataset();		
		for(int i = 0;i < value.length; i++) {
			data.addValue(value[i], "",i + "");
		}
		JFreeChart chart = ChartFactory.createLineChart(
				"Squares",
				"Time",
				"Value",
				data, 
				PlotOrientation.VERTICAL,
				true,
				false,
				false);
		ChartPanel cpanel = new ChartPanel(chart);
		add(cpanel,BorderLayout.CENTER);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));	
	}
	
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}

}
