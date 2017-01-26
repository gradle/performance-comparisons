package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_75 {
    private final Production28_75 production = new Production28_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}