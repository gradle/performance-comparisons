package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_198 {
    private final Production38_198 production = new Production38_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}