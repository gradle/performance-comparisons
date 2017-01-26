package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_330 {
    private final Production28_330 production = new Production28_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}