package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_236 {
    private final Production38_236 production = new Production38_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}