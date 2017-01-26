package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_297 {
    private final Production28_297 production = new Production28_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}