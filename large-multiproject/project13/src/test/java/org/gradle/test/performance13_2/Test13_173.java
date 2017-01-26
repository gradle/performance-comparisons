package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_173 {
    private final Production13_173 production = new Production13_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}