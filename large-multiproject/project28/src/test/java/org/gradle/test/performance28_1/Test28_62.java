package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_62 {
    private final Production28_62 production = new Production28_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}