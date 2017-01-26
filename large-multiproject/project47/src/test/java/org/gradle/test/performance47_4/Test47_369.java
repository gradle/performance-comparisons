package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_369 {
    private final Production47_369 production = new Production47_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}