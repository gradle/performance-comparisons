package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_266 {
    private final Production28_266 production = new Production28_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}