package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_358 {
    private final Production28_358 production = new Production28_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}