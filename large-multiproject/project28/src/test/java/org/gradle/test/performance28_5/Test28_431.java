package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_431 {
    private final Production28_431 production = new Production28_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}