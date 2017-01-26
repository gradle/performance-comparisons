package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_104 {
    private final Production28_104 production = new Production28_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}