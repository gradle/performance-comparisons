package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_463 {
    private final Production38_463 production = new Production38_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}