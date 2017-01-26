package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_175 {
    private final Production28_175 production = new Production28_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}