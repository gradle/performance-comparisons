package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_210 {
    private final Production28_210 production = new Production28_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}