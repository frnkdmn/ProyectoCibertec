package semana06;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class DialogoGenerarReportes extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JComboBox<String> cboTipoReporte;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoGenerarReportes dialog = new DialogoGenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoGenerarReportes() {
		setTitle("Generar Reportes");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("Tipo de Reporte");
		lblNewLabel.setBounds(10, 11, 91, 14);
		contentPanel.add(lblNewLabel);
		
		cboTipoReporte = new JComboBox<String>();
		cboTipoReporte.setModel(new DefaultComboBoxModel<String>(new String[] {"Ventas por marca", "Marcas con venta \u00F3ptima", "Precios en relaci\u00F3n al promedio", "Precio promedio, mayor y menor"}));
		cboTipoReporte.setBounds(101, 8, 202, 20);
		contentPanel.add(cboTipoReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 414, 214);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
}
