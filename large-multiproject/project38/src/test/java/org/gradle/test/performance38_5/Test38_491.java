package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_491 {
    private final Production38_491 production = new Production38_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}