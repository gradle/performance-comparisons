package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_369 {
    private final Production58_369 production = new Production58_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}