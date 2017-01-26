package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_382 {
    private final Production28_382 production = new Production28_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}