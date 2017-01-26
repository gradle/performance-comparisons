package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_500 {
    private final Production28_500 production = new Production28_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}