package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_203 {
    private final Production28_203 production = new Production28_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}