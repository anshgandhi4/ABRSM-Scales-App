/*
 * Copyright © 2020 Ansh Gandhi
 *
 * This file is part of Piano Scales Randomizer.
 *
 * Piano Scales Randomizer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Piano Scales Randomizer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Piano Scales Randomizer.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Original Author: Ansh Gandhi
 * Original Source Code: <https://github.com/anshipie/ABRSM-Scales-App/>
 * Original App: <https://play.google.com/store/apps/details?id=com.anshgandhi.pianoscalesrandomizer>
 *
 * EVERYTHING ABOVE THIS LINE MUST BE KEPT AS IS UNDER GNU GPL LICENSE RULES.
 */

package com.anshgandhi.pianoscalesrandomizer;

public class SaveSettings {
    public static final int NATURAL12 = 2131230872;
    public static final int HARMONIC12 = 2131230833;
    public static final int MELODIC12 = 2131230862;

    public static final int HARMONIC345 = 2131230834;
    public static final int MELODIC345 = 2131230863;

    public static final int GROUP1 = 2131230829;
    public static final int GROUP2 = 2131230830;


    private static int g12 = NATURAL12;
    private static int g345 = HARMONIC345;
    private static int g567 = GROUP1;

    public static int getG12() {
        return g12;
    }
    public static int getG345() {
        return g345;
    }
    public static int getG567() {return g567;}

    public static void setG12(int setting) {
        g12 = setting;
    }
    public static void setG345(int setting) {
        g345 = setting;
    }
    public static void setG567(int setting) {g567 = setting;}
}