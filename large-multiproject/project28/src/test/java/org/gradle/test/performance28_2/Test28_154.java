package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_154 {
    private final Production28_154 production = new Production28_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}