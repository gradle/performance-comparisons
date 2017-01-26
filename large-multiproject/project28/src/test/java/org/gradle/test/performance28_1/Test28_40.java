package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_40 {
    private final Production28_40 production = new Production28_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}