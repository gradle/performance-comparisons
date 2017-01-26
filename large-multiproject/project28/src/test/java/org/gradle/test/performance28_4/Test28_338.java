package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_338 {
    private final Production28_338 production = new Production28_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}