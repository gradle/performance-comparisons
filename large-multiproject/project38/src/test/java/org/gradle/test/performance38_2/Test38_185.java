package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_185 {
    private final Production38_185 production = new Production38_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}