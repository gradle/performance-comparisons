package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_284 {
    private final Production38_284 production = new Production38_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}