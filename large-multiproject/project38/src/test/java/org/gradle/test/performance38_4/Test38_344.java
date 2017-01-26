package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_344 {
    private final Production38_344 production = new Production38_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}