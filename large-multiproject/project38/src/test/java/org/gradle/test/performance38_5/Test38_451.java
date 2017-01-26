package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_451 {
    private final Production38_451 production = new Production38_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}