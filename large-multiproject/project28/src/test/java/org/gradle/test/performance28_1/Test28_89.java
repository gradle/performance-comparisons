package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_89 {
    private final Production28_89 production = new Production28_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}