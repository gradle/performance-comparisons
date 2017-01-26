package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_229 {
    private final Production28_229 production = new Production28_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}