package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_369 {
    private final Production8_369 production = new Production8_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}