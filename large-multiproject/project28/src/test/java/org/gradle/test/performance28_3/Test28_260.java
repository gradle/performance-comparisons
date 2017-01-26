package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_260 {
    private final Production28_260 production = new Production28_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}