package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_32 {
    private final Production38_32 production = new Production38_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}