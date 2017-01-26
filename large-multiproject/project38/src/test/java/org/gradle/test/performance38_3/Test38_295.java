package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_295 {
    private final Production38_295 production = new Production38_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}