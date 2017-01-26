package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_92 {
    private final Production28_92 production = new Production28_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}