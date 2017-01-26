package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_368 {
    private final Production38_368 production = new Production38_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}