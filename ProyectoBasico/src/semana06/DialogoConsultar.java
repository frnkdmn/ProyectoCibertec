package semana06;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class DialogoConsultar extends JDialog implements ActionListener, ItemListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblMarca;
	private JLabel lblPrecio;
	private JLabel lblGarantia;
	private JLabel lblTama�o;
	private JLabel lblMaterial;
	private JTextField txtPrecio;
	private JTextField txtGarantia;
	private JTextField txtTama�o;
	private JTextField txtMaterial;
	private JComboBox<String> cboMarca;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConsultar dialog = new DialogoConsultar();
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
	public DialogoConsultar() {
		setTitle("Consultar colch\u00F3n");
		setBounds(100, 100, 450, 210);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 30, 46, 14);
		contentPanel.add(lblMarca);
		
		lblPrecio = new JLabel("Precio (S/.)");
		lblPrecio.setBounds(10, 55, 61, 14);
		contentPanel.add(lblPrecio);
		
		lblGarantia = new JLabel("Garant\u00EDa (a\u00F1os)");
		lblGarantia.setBounds(10, 80, 81, 14);
		contentPanel.add(lblGarantia);
		
		lblTama�o = new JLabel("Tama\u00F1o");
		lblTama�o.setBounds(10, 105, 46, 14);
		contentPanel.add(lblTama�o);
		
		lblMaterial = new JLabel("Material");
		lblMaterial.setBounds(10, 130, 46, 14);
		contentPanel.add(lblMaterial);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(112, 52, 155, 20);
		txtPrecio.setEditable(false);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtGarantia = new JTextField();
		txtGarantia.setBounds(112, 77, 155, 20);
		txtGarantia.setEditable(false);
		contentPanel.add(txtGarantia);
		txtGarantia.setColumns(10);
		
		txtTama�o = new JTextField();
		txtTama�o.setBounds(112, 102, 155, 20);
		txtTama�o.setEditable(false);
		contentPanel.add(txtTama�o);
		txtTama�o.setColumns(10);
		
		txtMaterial = new JTextField();
		txtMaterial.setBounds(112, 127, 155, 20);
		txtMaterial.setEditable(false);
		contentPanel.add(txtMaterial);
		txtMaterial.setColumns(10);
		
		cboMarca = new JComboBox<String>();
		cboMarca.setBounds(112, 27, 155, 20);
		cboMarca.addItemListener(this);
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel<String>(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		contentPanel.add(cboMarca);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(335, 26, 89, 23);
		btnCerrar.addActionListener(this);
		contentPanel.add(btnCerrar);
		// fijar Suavizar como predeterminado
		txtPrecio.setText(""+ Tienda.precio0);
		txtGarantia.setText("" + Tienda.garantia0);
		txtTama�o.setText("" + Tienda.tama�o0);
		txtMaterial.setText("" + Tienda.material0);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
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
}
