package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_337 {
    private final Production28_337 production = new Production28_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}