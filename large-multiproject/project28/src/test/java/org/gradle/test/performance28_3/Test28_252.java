package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_252 {
    private final Production28_252 production = new Production28_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}