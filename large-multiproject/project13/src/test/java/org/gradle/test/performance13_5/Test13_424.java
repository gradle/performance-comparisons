package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_424 {
    private final Production13_424 production = new Production13_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}