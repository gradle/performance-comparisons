package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_223 {
    private final Production74_223 production = new Production74_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}