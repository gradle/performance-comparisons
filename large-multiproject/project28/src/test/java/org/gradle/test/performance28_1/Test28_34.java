package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_34 {
    private final Production28_34 production = new Production28_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}