package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_174 {
    private final Production28_174 production = new Production28_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}