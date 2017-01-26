package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_369 {
    private final Production48_369 production = new Production48_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}