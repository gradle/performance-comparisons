package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_222 {
    private final Production28_222 production = new Production28_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}