package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_259 {
    private final Production13_259 production = new Production13_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}