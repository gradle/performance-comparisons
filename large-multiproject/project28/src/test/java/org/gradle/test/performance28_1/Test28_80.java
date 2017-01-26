package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_80 {
    private final Production28_80 production = new Production28_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}