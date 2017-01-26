package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_397 {
    private final Production38_397 production = new Production38_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}