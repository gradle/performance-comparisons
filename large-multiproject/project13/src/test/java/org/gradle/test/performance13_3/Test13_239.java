package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_239 {
    private final Production13_239 production = new Production13_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}