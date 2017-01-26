package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_367 {
    private final Production13_367 production = new Production13_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}