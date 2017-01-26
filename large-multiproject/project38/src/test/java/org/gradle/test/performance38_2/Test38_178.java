package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_178 {
    private final Production38_178 production = new Production38_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}