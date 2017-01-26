package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_293 {
    private final Production28_293 production = new Production28_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}