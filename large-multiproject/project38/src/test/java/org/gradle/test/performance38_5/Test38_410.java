package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_410 {
    private final Production38_410 production = new Production38_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}