package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_109 {
    private final Production28_109 production = new Production28_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}