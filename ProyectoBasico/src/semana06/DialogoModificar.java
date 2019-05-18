package semana06;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoModificar extends JDialog implements ItemListener, ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JComboBox<String> cboMarca;
	private JTextField txtPrecio;
	private JTextField txtGarantia;
	private JTextField txtTama�o;
	private JTextField txtMaterial;
	private JButton btnCerrar;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoModificar dialog = new DialogoModificar();
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
	public DialogoModificar() {
		setTitle("Modificar colch\u00F3n");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("Marca");
		lblNewLabel.setBounds(10, 24, 46, 14);
		contentPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio (S/)");
		lblNewLabel_1.setBounds(10, 49, 89, 14);
		contentPanel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Garant\u00EDa (a\u00F1os)");
		lblNewLabel_2.setBounds(10, 74, 89, 14);
		contentPanel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Tama\u00F1o");
		lblNewLabel_3.setBounds(10, 99, 46, 14);
		contentPanel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Material");
		lblNewLabel_4.setBounds(10, 124, 46, 14);
		contentPanel.add(lblNewLabel_4);
		
		cboMarca = new JComboBox<String>();
		cboMarca.addItemListener(this);
		cboMarca.setModel(new DefaultComboBoxModel<String>(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.setBounds(124, 21, 149, 20);
		contentPanel.add(cboMarca);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(124, 46, 149, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtGarantia = new JTextField();
		txtGarantia.setBounds(124, 71, 149, 20);
		contentPanel.add(txtGarantia);
		txtGarantia.setColumns(10);
		
		txtTama�o = new JTextField();
		txtTama�o.setBounds(124, 96, 149, 20);
		contentPanel.add(txtTama�o);
		txtTama�o.setColumns(10);
		
		txtMaterial = new JTextField();
		txtMaterial.setBounds(124, 121, 149, 20);
		contentPanel.add(txtMaterial);
		txtMaterial.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 20, 89, 23);
		contentPanel.add(btnCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(335, 49, 89, 23);
		contentPanel.add(btnGrabar);
		
		// fijar Suavizar como predeterminado
		txtPrecio.setText(""+ Tienda.precio0);
		txtGarantia.setText("" + Tienda.garantia0);
		txtTama�o.setText("" + Tienda.tama�o0);
		txtMaterial.setText("" + Tienda.material0);
	}
	
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == cboMarca) {
			itemStateChangedCboMarca(arg0);
		}
	}
	protected void itemStateChangedCboMarca(ItemEvent arg0) {
		int item = cboMarca.getSelectedIndex();
		switch(item) {
			case 0:
				txtPrecio.setText(""+ Tienda.precio0);
				txtGarantia.setText("" + Tienda.garantia0);
				txtTama�o.setText("" + Tienda.tama�o0);
				txtMaterial.setText("" + Tienda.material0);
				break;
			case 1:
				txtPrecio.setText("" + Tienda.precio1);
				txtGarantia.setText("" + Tienda.garantia1);
				txtTama�o.setText("" + Tienda.tama�o1);
				txtMaterial.setText("" + Tienda.material1);
				break;
			case 2:
				txtPrecio.setText("" + Tienda.precio2);
				txtGarantia.setText("" + Tienda.garantia2);
				txtTama�o.setText("" + Tienda.tama�o2);
				txtMaterial.setText("" + Tienda.material2);
				break;
			case 3:
				txtPrecio.setText("" + Tienda.precio3);
				txtGarantia.setText("" + Tienda.garantia3);
				txtTama�o.setText("" + Tienda.tama�o3);
				txtMaterial.setText("" + Tienda.material3);
				break;
			default:
				txtPrecio.setText("" + Tienda.precio4);
				txtGarantia.setText("" + Tienda.garantia4);
				txtTama�o.setText("" + Tienda.tama�o4);
				txtMaterial.setText("" + Tienda.material4);		
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedBtnGrabar(ActionEvent arg0) {
		int item = cboMarca.getSelectedIndex();
		switch(item) {
			case 0:
				Tienda.precio0 = Double.parseDouble(txtPrecio.getText());
				Tienda.garantia0 = Integer.parseInt(txtGarantia.getText());
				Tienda.tama�o0 = txtTama�o.getText();
				Tienda.material0 = txtMaterial.getText();
				break;
			case 1:
				Tienda.precio1 = Double.parseDouble(txtPrecio.getText());
				Tienda.garantia1 = Integer.parseInt(txtGarantia.getText());
				Tienda.tama�o1 = txtTama�o.getText();
				Tienda.material1 = txtMaterial.getText();
				break;
			case 2:
				Tienda.precio2 = Double.parseDouble(txtPrecio.getText());
				Tienda.garantia2 = Integer.parseInt(txtGarantia.getText());
				Tienda.tama�o2 = txtTama�o.getText();
				Tienda.material2 = txtMaterial.getText();
				break;
			case 3:
				Tienda.precio3 = Double.parseDouble(txtPrecio.getText());
				Tienda.garantia3 = Integer.parseInt(txtGarantia.getText());
				Tienda.tama�o3 = txtTama�o.getText();
				Tienda.material3 = txtMaterial.getText();
				break;
			default:
				Tienda.precio4 = Double.parseDouble(txtPrecio.getText());
				Tienda.garantia4 = Integer.parseInt(txtGarantia.getText());
				Tienda.tama�o4 = txtTama�o.getText();
				Tienda.material4 = txtMaterial.getText();		
		}
		dispose();
	}
}
