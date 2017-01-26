package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_471 {
    private final Production13_471 production = new Production13_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}