package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_399 {
    private final Production38_399 production = new Production38_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}