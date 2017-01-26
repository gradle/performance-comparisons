package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_483 {
    private final Production38_483 production = new Production38_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}