package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_286 {
    private final Production28_286 production = new Production28_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}