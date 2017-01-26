package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_136 {
    private final Production28_136 production = new Production28_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}