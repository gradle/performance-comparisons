package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_350 {
    private final Production28_350 production = new Production28_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}