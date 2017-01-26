package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_238 {
    private final Production13_238 production = new Production13_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}