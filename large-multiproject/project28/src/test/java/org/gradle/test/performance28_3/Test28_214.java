package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_214 {
    private final Production28_214 production = new Production28_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}