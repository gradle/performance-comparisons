package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_422 {
    private final Production13_422 production = new Production13_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}