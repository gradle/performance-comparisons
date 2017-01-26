package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_271 {
    private final Production38_271 production = new Production38_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}