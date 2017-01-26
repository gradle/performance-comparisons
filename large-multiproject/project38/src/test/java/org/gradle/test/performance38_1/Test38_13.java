package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_13 {
    private final Production38_13 production = new Production38_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}