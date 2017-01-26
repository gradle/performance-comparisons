package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_291 {
    private final Production38_291 production = new Production38_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}