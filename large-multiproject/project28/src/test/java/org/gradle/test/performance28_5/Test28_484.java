package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_484 {
    private final Production28_484 production = new Production28_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}