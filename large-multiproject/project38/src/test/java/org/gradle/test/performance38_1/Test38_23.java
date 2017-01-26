package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_23 {
    private final Production38_23 production = new Production38_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}