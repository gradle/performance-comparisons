package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_390 {
    private final Production28_390 production = new Production28_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}