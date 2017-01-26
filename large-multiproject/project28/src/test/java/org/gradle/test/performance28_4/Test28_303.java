package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_303 {
    private final Production28_303 production = new Production28_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}