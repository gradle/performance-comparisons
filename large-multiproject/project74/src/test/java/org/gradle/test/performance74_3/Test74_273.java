package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_273 {
    private final Production74_273 production = new Production74_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}