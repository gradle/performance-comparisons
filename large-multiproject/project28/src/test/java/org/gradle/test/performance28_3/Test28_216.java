package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_216 {
    private final Production28_216 production = new Production28_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}