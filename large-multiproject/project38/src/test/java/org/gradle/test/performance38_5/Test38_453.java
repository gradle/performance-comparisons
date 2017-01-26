package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_453 {
    private final Production38_453 production = new Production38_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}