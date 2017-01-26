package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_238 {
    private final Production28_238 production = new Production28_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}