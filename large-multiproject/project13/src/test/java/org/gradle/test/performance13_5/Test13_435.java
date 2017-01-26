package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_435 {
    private final Production13_435 production = new Production13_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}