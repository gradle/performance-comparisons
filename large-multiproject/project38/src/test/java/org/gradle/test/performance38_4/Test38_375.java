package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_375 {
    private final Production38_375 production = new Production38_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}