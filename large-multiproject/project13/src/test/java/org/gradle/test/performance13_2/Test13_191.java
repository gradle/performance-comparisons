package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_191 {
    private final Production13_191 production = new Production13_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}