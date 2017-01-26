package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_175 {
    private final Production13_175 production = new Production13_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}