package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_112 {
    private final Production28_112 production = new Production28_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}