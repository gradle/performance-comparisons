package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_134 {
    private final Production28_134 production = new Production28_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}