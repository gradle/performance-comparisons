package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_375 {
    private final Production74_375 production = new Production74_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}