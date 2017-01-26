package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_332 {
    private final Production38_332 production = new Production38_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}