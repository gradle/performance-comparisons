package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_22 {
    private final Production38_22 production = new Production38_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}