package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_490 {
    private final Production38_490 production = new Production38_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}