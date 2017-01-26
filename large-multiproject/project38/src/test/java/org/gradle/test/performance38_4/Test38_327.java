package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_327 {
    private final Production38_327 production = new Production38_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}