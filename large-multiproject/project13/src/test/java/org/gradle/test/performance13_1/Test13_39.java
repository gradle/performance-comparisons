package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_39 {
    private final Production13_39 production = new Production13_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}