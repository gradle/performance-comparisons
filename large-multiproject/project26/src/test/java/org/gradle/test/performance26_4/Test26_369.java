package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_369 {
    private final Production26_369 production = new Production26_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}