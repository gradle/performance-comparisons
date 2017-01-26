package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_35 {
    private final Production28_35 production = new Production28_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}