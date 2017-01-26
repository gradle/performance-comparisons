package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_232 {
    private final Production38_232 production = new Production38_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}