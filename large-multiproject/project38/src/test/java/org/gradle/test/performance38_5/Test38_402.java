package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_402 {
    private final Production38_402 production = new Production38_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}