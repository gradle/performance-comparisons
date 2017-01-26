package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_233 {
    private final Production74_233 production = new Production74_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}