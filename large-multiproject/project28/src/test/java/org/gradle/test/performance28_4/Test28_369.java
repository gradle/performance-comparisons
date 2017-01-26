package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_369 {
    private final Production28_369 production = new Production28_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}