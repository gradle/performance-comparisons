package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_78 {
    private final Production28_78 production = new Production28_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}