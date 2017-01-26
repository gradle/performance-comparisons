package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_492 {
    private final Production28_492 production = new Production28_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}