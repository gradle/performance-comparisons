package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_96 {
    private final Production28_96 production = new Production28_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}