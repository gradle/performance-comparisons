package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_210 {
    private final Production13_210 production = new Production13_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}