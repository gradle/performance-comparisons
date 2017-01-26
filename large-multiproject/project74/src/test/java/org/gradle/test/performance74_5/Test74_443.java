package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_443 {
    private final Production74_443 production = new Production74_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}