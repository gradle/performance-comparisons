package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_430 {
    private final Production60_430 production = new Production60_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}