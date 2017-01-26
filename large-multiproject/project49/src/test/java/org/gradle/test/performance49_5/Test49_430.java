package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_430 {
    private final Production49_430 production = new Production49_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}