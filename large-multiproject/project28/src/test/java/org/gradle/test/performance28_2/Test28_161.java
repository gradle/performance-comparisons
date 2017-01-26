package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_161 {
    private final Production28_161 production = new Production28_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}