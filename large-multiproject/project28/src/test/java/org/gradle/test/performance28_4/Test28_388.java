package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_388 {
    private final Production28_388 production = new Production28_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}