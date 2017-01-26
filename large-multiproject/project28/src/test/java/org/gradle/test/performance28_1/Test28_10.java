package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_10 {
    private final Production28_10 production = new Production28_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}