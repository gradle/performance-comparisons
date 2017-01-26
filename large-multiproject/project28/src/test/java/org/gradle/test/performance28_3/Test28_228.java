package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_228 {
    private final Production28_228 production = new Production28_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}