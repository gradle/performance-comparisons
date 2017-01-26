package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_29 {
    private final Production28_29 production = new Production28_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}