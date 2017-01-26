package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_481 {
    private final Production28_481 production = new Production28_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}