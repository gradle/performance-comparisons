package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_385 {
    private final Production38_385 production = new Production38_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}