package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_14 {
    private final Production28_14 production = new Production28_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}