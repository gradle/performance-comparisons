package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_364 {
    private final Production13_364 production = new Production13_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}