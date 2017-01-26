package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_298 {
    private final Production38_298 production = new Production38_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}