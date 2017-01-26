package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_35 {
    private final Production13_35 production = new Production13_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}