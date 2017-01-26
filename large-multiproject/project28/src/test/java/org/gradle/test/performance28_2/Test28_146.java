package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_146 {
    private final Production28_146 production = new Production28_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}