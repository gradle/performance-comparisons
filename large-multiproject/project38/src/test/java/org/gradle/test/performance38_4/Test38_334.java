package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_334 {
    private final Production38_334 production = new Production38_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}