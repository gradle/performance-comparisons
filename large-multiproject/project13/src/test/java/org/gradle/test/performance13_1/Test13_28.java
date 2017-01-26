package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_28 {
    private final Production13_28 production = new Production13_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}