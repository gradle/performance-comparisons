package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_2 {
    private final Production28_2 production = new Production28_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}