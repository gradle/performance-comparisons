package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_436 {
    private final Production38_436 production = new Production38_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}