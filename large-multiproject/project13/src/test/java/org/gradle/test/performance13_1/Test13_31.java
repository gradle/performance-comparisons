package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_31 {
    private final Production13_31 production = new Production13_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}