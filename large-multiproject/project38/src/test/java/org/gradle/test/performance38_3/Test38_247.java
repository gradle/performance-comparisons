package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_247 {
    private final Production38_247 production = new Production38_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}