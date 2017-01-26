package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_369 {
    private final Production40_369 production = new Production40_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}