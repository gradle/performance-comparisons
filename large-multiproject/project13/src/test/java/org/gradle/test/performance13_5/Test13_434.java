package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_434 {
    private final Production13_434 production = new Production13_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}