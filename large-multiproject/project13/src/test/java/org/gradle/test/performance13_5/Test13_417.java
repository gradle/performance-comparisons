package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_417 {
    private final Production13_417 production = new Production13_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}