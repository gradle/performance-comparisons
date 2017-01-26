package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_493 {
    private final Production38_493 production = new Production38_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}