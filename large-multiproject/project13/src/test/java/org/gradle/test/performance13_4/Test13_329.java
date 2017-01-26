package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_329 {
    private final Production13_329 production = new Production13_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}