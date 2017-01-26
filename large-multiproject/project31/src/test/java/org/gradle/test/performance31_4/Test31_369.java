package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_369 {
    private final Production31_369 production = new Production31_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}