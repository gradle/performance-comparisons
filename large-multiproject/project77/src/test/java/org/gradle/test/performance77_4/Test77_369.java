package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_369 {
    private final Production77_369 production = new Production77_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}