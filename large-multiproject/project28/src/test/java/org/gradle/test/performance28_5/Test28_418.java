package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_418 {
    private final Production28_418 production = new Production28_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}