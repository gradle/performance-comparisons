package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_281 {
    private final Production28_281 production = new Production28_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}