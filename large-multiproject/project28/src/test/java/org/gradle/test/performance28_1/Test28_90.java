package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_90 {
    private final Production28_90 production = new Production28_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}