package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_465 {
    private final Production28_465 production = new Production28_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}