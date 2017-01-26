package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_369 {
    private final Production7_369 production = new Production7_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}