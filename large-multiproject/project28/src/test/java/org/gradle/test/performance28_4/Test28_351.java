package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_351 {
    private final Production28_351 production = new Production28_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}