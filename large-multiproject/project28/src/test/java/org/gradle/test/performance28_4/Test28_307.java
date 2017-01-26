package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_307 {
    private final Production28_307 production = new Production28_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}