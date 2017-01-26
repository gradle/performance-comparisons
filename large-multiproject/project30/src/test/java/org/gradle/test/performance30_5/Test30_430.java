package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_430 {
    private final Production30_430 production = new Production30_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}