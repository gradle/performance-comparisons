package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_98 {
    private final Production28_98 production = new Production28_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}