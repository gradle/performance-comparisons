package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_369 {
    private final Production93_369 production = new Production93_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}