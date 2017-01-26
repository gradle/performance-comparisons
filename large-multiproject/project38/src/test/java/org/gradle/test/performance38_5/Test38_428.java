package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_428 {
    private final Production38_428 production = new Production38_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}