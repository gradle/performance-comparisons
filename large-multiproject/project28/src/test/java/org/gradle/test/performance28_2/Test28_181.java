package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_181 {
    private final Production28_181 production = new Production28_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}