package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_426 {
    private final Production28_426 production = new Production28_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}