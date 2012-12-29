package net.minesocket.potionpermissions;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PotionListener implements Listener {
	
	public static PotionPermissions plugin;
	
	public PotionListener(PotionPermissions instance) {
		plugin = instance;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		// Speed
		if (p.hasPermission("potionpermissions.speed.one")) {
			p.removePotionEffect(PotionEffectType.SPEED);
			p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 0));
		}
		if (p.hasPermission("potionpermissions.speed.two")) {
			p.removePotionEffect(PotionEffectType.SPEED);
			p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 1));
		} if (p.hasPermission("potionpermissions.speed.three")) {
			p.removePotionEffect(PotionEffectType.SPEED);
			p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 2));
			// Blindness
		}if (p.hasPermission("potionpermissions.speed.one")) {
			p.removePotionEffect(PotionEffectType.BLINDNESS);
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 18000, 0));
		}
		if (p.hasPermission("potionpermissions.speed.two")) {
			p.removePotionEffect(PotionEffectType.BLINDNESS);
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 18000, 1));
		} if (p.hasPermission("potionpermissions.speed.three")) {
			p.removePotionEffect(PotionEffectType.BLINDNESS);
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 18000, 2));
		} // Confusion
		if (p.hasPermission("potionpermissions.confusion.one")) {
			p.removePotionEffect(PotionEffectType.CONFUSION);
			p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 18000, 0));
		}
		if (p.hasPermission("potionpermissions.confusion.two")) {
			p.removePotionEffect(PotionEffectType.CONFUSION);
			p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 18000, 1));
		} if (p.hasPermission("potionpermissions.confusion.three")) {
			p.removePotionEffect(PotionEffectType.CONFUSION);
			p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 18000, 2));
		} // Damage Resistance
		if (p.hasPermission("potionpermissions.damageresistance.one")) {
			p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
			p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 18000, 0));
		}
		if (p.hasPermission("potionpermissions.damageresistance.two")) {
			p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
			p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 18000, 1));
		} if (p.hasPermission("potionpermissions.damageresistance.three")) {
			p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
			p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 18000, 2));
		}
	}

}
