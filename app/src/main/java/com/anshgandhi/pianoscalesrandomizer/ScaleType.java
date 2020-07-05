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
 * Original App: Waiting for Publish
 *
 * EVERYTHING ABOVE THIS LINE MUST BE KEPT AS IS UNDER GNU GPL LICENSE RULES.
 */

package com.anshgandhi.pianoscalesrandomizer;

public class ScaleType {
    private static int type;
    private static int grade;

    static int getType() {
        return type;
    }

    static void setType(int newType) {
        type = newType;
    }

    static int getGrade() {
        return grade;
    }

    static void setGrade(int newGrade) {
        grade = newGrade;
    }
}
