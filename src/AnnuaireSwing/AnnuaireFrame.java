package AnnuaireSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Annuaire.Contact;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnnuaireFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPrenom;
	private JTextField textFieldNom;
	private JTextField textFieldAge;
	private JTextField textFieldEmail;
	private JTextField textFieldTelephone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnnuaireFrame frame = new AnnuaireFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AnnuaireFrame() {
		setTitle("Annuaire en Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textFieldPrenom = new JTextField();
		textFieldPrenom.setBounds(175, 38, 158, 22);
		contentPane.add(textFieldPrenom);
		textFieldPrenom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pr\u00E9nom :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(47, 38, 91, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNom.setBounds(47, 73, 91, 22);
		contentPane.add(lblNom);
		
		textFieldNom = new JTextField();
		textFieldNom.setColumns(10);
		textFieldNom.setBounds(175, 76, 158, 22);
		contentPane.add(textFieldNom);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAge.setBounds(47, 108, 91, 22);
		contentPane.add(lblAge);
		
		textFieldAge = new JTextField();
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(175, 111, 158, 22);
		contentPane.add(textFieldAge);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(47, 146, 91, 22);
		contentPane.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(175, 146, 158, 22);
		contentPane.add(textFieldEmail);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone :");
		lblTlphone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTlphone.setBounds(47, 184, 116, 22);
		contentPane.add(lblTlphone);
		
		textFieldTelephone = new JTextField();
		textFieldTelephone.setColumns(10);
		textFieldTelephone.setBounds(175, 187, 158, 22);
		contentPane.add(textFieldTelephone);
		
		JButton btnCreerContact = new JButton("Cr\u00E9er Contact");
		btnCreerContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String prenom = textFieldPrenom.getText();
				String nom = textFieldNom.getText();
				int age = Integer.parseInt(textFieldAge.getText());
				String email = textFieldEmail.getText();
				String telephone = textFieldTelephone.getText();
				
				Contact nouveauContact = new Contact(prenom, nom, telephone, email, age);
				nouveauContact.sauvegarder();
			

				textFieldNom.setText(null);
				textFieldPrenom.setText(null);
				textFieldAge.setText(null);
				textFieldEmail.setText(null);
				textFieldTelephone.setText(null);
				
				JOptionPane.showMessageDialog(null, "Le contact a bien été sauvegardé.");
			}
		});
		btnCreerContact.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCreerContact.setBounds(250, 247, 172, 33);
		contentPane.add(btnCreerContact);
	}
}
