package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_268 {
    private final Production13_268 production = new Production13_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}