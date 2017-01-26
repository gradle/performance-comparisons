package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_392 {
    private final Production28_392 production = new Production28_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}