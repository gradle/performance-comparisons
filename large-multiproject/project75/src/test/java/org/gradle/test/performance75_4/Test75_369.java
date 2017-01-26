package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_369 {
    private final Production75_369 production = new Production75_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}