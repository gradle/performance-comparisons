package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_245 {
    private final Production38_245 production = new Production38_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}