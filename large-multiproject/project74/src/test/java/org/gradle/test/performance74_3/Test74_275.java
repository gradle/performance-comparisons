package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_275 {
    private final Production74_275 production = new Production74_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}