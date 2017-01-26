package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_346 {
    private final Production38_346 production = new Production38_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}