package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_377 {
    private final Production28_377 production = new Production28_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}