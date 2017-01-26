package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_369 {
    private final Production54_369 production = new Production54_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}