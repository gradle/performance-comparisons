package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_328 {
    private final Production74_328 production = new Production74_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}