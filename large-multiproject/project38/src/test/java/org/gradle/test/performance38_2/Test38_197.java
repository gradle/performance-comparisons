package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_197 {
    private final Production38_197 production = new Production38_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}