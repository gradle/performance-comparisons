package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_323 {
    private final Production28_323 production = new Production28_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}