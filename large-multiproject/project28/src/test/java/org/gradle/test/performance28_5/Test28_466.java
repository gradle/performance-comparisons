package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_466 {
    private final Production28_466 production = new Production28_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}