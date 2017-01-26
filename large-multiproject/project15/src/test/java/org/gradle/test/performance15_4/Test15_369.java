package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_369 {
    private final Production15_369 production = new Production15_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}