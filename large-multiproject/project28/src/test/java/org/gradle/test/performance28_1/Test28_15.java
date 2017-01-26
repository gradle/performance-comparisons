package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_15 {
    private final Production28_15 production = new Production28_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}