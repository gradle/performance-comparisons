package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_320 {
    private final Production28_320 production = new Production28_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}