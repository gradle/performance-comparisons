package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_415 {
    private final Production28_415 production = new Production28_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}