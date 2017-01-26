package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_369 {
    private final Production25_369 production = new Production25_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}