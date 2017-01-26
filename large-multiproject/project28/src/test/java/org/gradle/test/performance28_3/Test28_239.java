package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_239 {
    private final Production28_239 production = new Production28_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}