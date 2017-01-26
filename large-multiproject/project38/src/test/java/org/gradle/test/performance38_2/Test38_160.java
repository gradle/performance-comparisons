package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_160 {
    private final Production38_160 production = new Production38_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}