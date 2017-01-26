package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_50 {
    private final Production38_50 production = new Production38_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}