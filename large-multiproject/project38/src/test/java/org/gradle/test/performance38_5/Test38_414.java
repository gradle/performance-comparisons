package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_414 {
    private final Production38_414 production = new Production38_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}