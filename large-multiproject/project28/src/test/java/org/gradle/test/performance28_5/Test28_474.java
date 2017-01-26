package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_474 {
    private final Production28_474 production = new Production28_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}