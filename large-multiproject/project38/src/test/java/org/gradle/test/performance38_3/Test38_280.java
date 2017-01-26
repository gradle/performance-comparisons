package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_280 {
    private final Production38_280 production = new Production38_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}