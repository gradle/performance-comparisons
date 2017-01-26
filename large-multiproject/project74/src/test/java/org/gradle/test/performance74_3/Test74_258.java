package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_258 {
    private final Production74_258 production = new Production74_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}