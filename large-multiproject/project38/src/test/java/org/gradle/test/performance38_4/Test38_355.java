package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_355 {
    private final Production38_355 production = new Production38_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}