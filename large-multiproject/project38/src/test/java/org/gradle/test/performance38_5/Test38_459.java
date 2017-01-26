package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_459 {
    private final Production38_459 production = new Production38_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}