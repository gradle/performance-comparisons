package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_430 {
    private final Production42_430 production = new Production42_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}