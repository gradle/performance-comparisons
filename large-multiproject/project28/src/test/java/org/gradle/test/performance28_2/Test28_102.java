package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_102 {
    private final Production28_102 production = new Production28_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}