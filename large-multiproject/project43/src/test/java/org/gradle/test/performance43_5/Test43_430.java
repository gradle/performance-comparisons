package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_430 {
    private final Production43_430 production = new Production43_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}