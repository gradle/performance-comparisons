package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_8 {
    private final Production28_8 production = new Production28_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}