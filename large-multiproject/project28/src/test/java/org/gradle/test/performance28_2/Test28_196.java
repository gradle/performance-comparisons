package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_196 {
    private final Production28_196 production = new Production28_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}