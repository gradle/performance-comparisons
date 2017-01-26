package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_252 {
    private final Production38_252 production = new Production38_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}