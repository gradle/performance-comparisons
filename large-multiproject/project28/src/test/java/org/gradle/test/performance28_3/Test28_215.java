package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_215 {
    private final Production28_215 production = new Production28_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}