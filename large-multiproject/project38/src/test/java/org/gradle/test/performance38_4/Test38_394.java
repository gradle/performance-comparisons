package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_394 {
    private final Production38_394 production = new Production38_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}