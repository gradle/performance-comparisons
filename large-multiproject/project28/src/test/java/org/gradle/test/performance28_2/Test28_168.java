package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_168 {
    private final Production28_168 production = new Production28_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}