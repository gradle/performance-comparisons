package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_495 {
    private final Production28_495 production = new Production28_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}