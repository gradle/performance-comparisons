package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_485 {
    private final Production28_485 production = new Production28_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}