package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_369 {
    private final Production37_369 production = new Production37_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}