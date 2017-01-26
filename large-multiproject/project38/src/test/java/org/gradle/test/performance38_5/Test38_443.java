package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_443 {
    private final Production38_443 production = new Production38_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}