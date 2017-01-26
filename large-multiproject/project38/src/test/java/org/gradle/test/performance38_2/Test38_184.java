package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_184 {
    private final Production38_184 production = new Production38_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}