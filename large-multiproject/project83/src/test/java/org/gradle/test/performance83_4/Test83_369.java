package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_369 {
    private final Production83_369 production = new Production83_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}