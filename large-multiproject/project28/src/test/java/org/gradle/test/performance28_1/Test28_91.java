package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_91 {
    private final Production28_91 production = new Production28_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}