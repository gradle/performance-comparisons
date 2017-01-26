package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_383 {
    private final Production38_383 production = new Production38_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}