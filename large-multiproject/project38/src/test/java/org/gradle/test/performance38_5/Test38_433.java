package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_433 {
    private final Production38_433 production = new Production38_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}