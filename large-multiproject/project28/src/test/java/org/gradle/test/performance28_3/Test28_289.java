package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_289 {
    private final Production28_289 production = new Production28_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}