package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_235 {
    private final Production28_235 production = new Production28_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}