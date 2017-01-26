package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_319 {
    private final Production38_319 production = new Production38_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}