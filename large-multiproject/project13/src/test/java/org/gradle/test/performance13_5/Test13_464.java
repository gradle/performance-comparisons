package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_464 {
    private final Production13_464 production = new Production13_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}