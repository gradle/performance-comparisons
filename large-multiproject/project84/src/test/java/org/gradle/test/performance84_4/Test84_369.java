package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_369 {
    private final Production84_369 production = new Production84_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}