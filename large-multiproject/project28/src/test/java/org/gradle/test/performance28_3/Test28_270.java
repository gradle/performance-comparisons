package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_270 {
    private final Production28_270 production = new Production28_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}