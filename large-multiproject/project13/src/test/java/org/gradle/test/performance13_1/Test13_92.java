package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_92 {
    private final Production13_92 production = new Production13_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}