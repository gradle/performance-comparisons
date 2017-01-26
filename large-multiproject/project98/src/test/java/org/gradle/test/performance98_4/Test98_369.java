package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_369 {
    private final Production98_369 production = new Production98_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}