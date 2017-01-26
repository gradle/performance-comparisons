package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_138 {
    private final Production28_138 production = new Production28_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}