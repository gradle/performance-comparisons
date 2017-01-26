package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_487 {
    private final Production38_487 production = new Production38_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}