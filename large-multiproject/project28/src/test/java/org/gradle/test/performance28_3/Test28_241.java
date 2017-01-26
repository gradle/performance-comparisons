package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_241 {
    private final Production28_241 production = new Production28_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}