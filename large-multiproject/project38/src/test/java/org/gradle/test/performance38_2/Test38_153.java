package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_153 {
    private final Production38_153 production = new Production38_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}