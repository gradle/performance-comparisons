package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_187 {
    private final Production28_187 production = new Production28_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}