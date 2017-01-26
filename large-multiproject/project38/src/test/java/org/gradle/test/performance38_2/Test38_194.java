package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_194 {
    private final Production38_194 production = new Production38_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}