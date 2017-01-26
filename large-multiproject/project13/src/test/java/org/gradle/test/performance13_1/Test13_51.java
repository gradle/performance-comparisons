package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_51 {
    private final Production13_51 production = new Production13_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}