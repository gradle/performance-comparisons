package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_112 {
    private final Production13_112 production = new Production13_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}