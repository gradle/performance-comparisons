package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_369 {
    private final Production41_369 production = new Production41_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}