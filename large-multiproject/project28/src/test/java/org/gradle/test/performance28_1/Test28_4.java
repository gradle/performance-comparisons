package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_4 {
    private final Production28_4 production = new Production28_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}