package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_356 {
    private final Production28_356 production = new Production28_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}