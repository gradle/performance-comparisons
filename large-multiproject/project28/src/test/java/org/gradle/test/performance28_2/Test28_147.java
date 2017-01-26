package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_147 {
    private final Production28_147 production = new Production28_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}