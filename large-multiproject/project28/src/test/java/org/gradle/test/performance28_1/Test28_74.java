package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_74 {
    private final Production28_74 production = new Production28_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}