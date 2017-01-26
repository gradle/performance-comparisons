package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_240 {
    private final Production38_240 production = new Production38_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}