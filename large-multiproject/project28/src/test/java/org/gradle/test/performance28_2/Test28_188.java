package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_188 {
    private final Production28_188 production = new Production28_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}