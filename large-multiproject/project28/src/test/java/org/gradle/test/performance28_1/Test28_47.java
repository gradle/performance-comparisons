package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_47 {
    private final Production28_47 production = new Production28_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}