package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_233 {
    private final Production38_233 production = new Production38_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}