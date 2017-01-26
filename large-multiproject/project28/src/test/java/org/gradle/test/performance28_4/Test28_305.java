package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_305 {
    private final Production28_305 production = new Production28_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}