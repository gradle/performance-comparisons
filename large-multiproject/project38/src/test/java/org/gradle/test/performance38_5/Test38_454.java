package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_454 {
    private final Production38_454 production = new Production38_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}