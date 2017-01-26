package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_60 {
    private final Production13_60 production = new Production13_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}