package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_434 {
    private final Production28_434 production = new Production28_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}