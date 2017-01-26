package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_145 {
    private final Production13_145 production = new Production13_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}