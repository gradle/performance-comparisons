package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_408 {
    private final Production38_408 production = new Production38_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}