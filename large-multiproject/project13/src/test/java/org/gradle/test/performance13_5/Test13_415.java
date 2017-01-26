package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_415 {
    private final Production13_415 production = new Production13_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}