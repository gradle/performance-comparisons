package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_333 {
    private final Production38_333 production = new Production38_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}