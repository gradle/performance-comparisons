package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_430 {
    private final Production38_430 production = new Production38_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}