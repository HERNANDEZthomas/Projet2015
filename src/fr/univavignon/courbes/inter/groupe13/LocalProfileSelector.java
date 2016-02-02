package fr.univavignon.courbes.inter.groupe13;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;

import fr.univavignon.courbes.common.Player;
import fr.univavignon.courbes.common.Profile;

public class LocalProfileSelector {
	
	private List<Player> availablePlayers;
	
	private JButton leftButton = new JButton("Non défini");
	private JButton rightButton = new JButton("Non défini");
	private JButton sendProfileToServer = new JButton("Envoyer au serveur");
	private JButton removeFromServer = new JButton("Retirer du serveur");

	private JComboBox<Profile> jc_playerSelector;
	
	private ControllableProfile c_profile;
	
	public LocalProfileSelector(Vector<Profile> players){
		
		c_profile = new ControllableProfile();
		
		jc_playerSelector = new JComboBox<>(players);

		rightButton.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
	   		   rightButton.setText(KeyEvent.getKeyText(e.getKeyCode()));
	   		   c_profile.setRight(e);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {}
		});
		
		leftButton.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
	   		   leftButton.setText(KeyEvent.getKeyText(e.getKeyCode()));
	   		   c_profile.setLeft(e);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {}
		});
	}

	public JButton getLeftButton() {
		return leftButton;
	}

	public ControllableProfile getC_profile() {
		return c_profile;
	}

	public void setC_profile(ControllableProfile c_profile) {
		this.c_profile = c_profile;
	}

	public void setLeftButton(JButton leftButton) {
		this.leftButton = leftButton;
	}

	public JButton getRightButton() {
		return rightButton;
	}

	public void setRightButton(JButton rightButton) {
		this.rightButton = rightButton;
	}

	public JComboBox<Profile> getJc_playerSelector() {
		return jc_playerSelector;
	}

	public void setJc_playerSelector(JComboBox<Profile> jc_playerSelector) {
		this.jc_playerSelector = jc_playerSelector;
	}
	public JButton getSendProfileToServer() {
		return sendProfileToServer;
	}

	public void setSendProfileToServer(JButton sendProfileToServer) {
		this.sendProfileToServer = sendProfileToServer;
	}

	public JButton getRemoveFromServer() {
		return removeFromServer;
	}

	public void setRemoveFromServer(JButton removeFromServer) {
		this.removeFromServer = removeFromServer;
	}
	
	

}
