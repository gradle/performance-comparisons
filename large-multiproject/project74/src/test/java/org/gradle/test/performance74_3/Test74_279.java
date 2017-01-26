package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_279 {
    private final Production74_279 production = new Production74_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}