package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_430 {
    private final Production79_430 production = new Production79_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}