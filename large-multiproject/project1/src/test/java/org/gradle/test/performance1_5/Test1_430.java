package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_430 {
    private final Production1_430 production = new Production1_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}