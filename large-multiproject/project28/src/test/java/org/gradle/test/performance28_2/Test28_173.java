package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_173 {
    private final Production28_173 production = new Production28_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}