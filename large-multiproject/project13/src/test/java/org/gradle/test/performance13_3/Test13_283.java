package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_283 {
    private final Production13_283 production = new Production13_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}