package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_67 {
    private final Production28_67 production = new Production28_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}