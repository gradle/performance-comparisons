package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_325 {
    private final Production28_325 production = new Production28_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}