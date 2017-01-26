package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_145 {
    private final Production28_145 production = new Production28_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}