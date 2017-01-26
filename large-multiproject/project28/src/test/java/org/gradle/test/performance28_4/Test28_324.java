package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_324 {
    private final Production28_324 production = new Production28_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}