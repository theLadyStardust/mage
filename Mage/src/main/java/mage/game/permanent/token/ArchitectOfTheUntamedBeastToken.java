package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author spjspj
 */
public final class ArchitectOfTheUntamedBeastToken extends TokenImpl {

    public ArchitectOfTheUntamedBeastToken() {
        super("Beast Token", "6/6 colorless Beast artifact creature token");
        cardType.add(CardType.ARTIFACT);
        cardType.add(CardType.CREATURE);
        subtype.add(SubType.BEAST);
        power = new MageInt(6);
        toughness = new MageInt(6);
    }

    public ArchitectOfTheUntamedBeastToken(final ArchitectOfTheUntamedBeastToken token) {
        super(token);
    }

    public ArchitectOfTheUntamedBeastToken copy() {
        return new ArchitectOfTheUntamedBeastToken(this);
    }
}

