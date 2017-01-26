package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_53 {
    private final Production28_53 production = new Production28_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}