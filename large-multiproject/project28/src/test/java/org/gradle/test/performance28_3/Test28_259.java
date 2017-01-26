package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_259 {
    private final Production28_259 production = new Production28_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}