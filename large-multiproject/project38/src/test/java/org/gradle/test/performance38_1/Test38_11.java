package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_11 {
    private final Production38_11 production = new Production38_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}