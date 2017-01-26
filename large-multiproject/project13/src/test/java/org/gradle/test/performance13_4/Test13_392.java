package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_392 {
    private final Production13_392 production = new Production13_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}