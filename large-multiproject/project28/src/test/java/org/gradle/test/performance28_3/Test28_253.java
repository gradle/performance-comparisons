package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_253 {
    private final Production28_253 production = new Production28_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}