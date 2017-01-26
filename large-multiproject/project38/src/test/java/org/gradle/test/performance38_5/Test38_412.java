package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_412 {
    private final Production38_412 production = new Production38_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}