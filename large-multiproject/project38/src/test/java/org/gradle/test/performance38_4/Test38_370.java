package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_370 {
    private final Production38_370 production = new Production38_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}