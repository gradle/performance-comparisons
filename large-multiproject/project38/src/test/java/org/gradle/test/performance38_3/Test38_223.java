package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_223 {
    private final Production38_223 production = new Production38_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}