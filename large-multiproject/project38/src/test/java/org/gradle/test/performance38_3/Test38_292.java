package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_292 {
    private final Production38_292 production = new Production38_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}