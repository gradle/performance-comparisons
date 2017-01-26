package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_163 {
    private final Production28_163 production = new Production28_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}