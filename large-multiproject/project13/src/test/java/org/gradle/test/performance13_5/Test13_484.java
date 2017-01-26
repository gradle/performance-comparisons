package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_484 {
    private final Production13_484 production = new Production13_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}