package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_258 {
    private final Production38_258 production = new Production38_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}