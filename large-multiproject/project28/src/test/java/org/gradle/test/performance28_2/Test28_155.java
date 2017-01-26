package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_155 {
    private final Production28_155 production = new Production28_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}