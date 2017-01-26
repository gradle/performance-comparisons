package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_280 {
    private final Production74_280 production = new Production74_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}