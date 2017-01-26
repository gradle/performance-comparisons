package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_202 {
    private final Production28_202 production = new Production28_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}