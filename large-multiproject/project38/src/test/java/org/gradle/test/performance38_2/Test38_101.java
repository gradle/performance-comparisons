package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_101 {
    private final Production38_101 production = new Production38_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}