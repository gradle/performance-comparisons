package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_72 {
    private final Production28_72 production = new Production28_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}