package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_94 {
    private final Production38_94 production = new Production38_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}