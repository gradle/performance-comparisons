package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_376 {
    private final Production74_376 production = new Production74_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}