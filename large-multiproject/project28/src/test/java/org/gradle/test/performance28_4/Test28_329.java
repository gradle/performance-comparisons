package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_329 {
    private final Production28_329 production = new Production28_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}