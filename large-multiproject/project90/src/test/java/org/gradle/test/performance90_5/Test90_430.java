package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_430 {
    private final Production90_430 production = new Production90_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}