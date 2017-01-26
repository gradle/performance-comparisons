package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_432 {
    private final Production28_432 production = new Production28_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}