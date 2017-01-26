package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_248 {
    private final Production38_248 production = new Production38_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}