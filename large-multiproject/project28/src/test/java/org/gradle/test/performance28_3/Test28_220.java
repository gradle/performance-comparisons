package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_220 {
    private final Production28_220 production = new Production28_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}