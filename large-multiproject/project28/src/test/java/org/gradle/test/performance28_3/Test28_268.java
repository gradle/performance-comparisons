package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_268 {
    private final Production28_268 production = new Production28_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}