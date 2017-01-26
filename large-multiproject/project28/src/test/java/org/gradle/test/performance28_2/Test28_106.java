package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_106 {
    private final Production28_106 production = new Production28_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}