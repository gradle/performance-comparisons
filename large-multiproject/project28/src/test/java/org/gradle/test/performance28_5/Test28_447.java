package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_447 {
    private final Production28_447 production = new Production28_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}