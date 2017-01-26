package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_335 {
    private final Production38_335 production = new Production38_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}