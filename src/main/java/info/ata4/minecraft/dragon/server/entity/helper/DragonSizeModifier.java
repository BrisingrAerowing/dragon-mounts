/*
 ** 2013 October 31
 **
 ** The author disclaims copyright to this source code.  In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package info.ata4.minecraft.dragon.server.entity.helper;

import java.util.UUID;
import net.minecraft.entity.ai.attributes.AttributeModifier;

/**
 *
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public class DragonSizeModifier extends AttributeModifier {
    
    public static final UUID ID = UUID.fromString("856d4ba4-9ffe-4a52-8606-890bb9be538b");
    private double size;

    public DragonSizeModifier() {
        super(ID, "Dragon size modifier", 0, 1);
        setSaved(false);
    }

    @Override
    public double getAmount() {
        return size - 1;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}