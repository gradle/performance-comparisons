package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_402 {
    private final Production74_402 production = new Production74_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}