package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_157 {
    private final Production28_157 production = new Production28_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}