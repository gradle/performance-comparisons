package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_316 {
    private final Production38_316 production = new Production38_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}