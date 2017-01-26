package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_114 {
    private final Production28_114 production = new Production28_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}