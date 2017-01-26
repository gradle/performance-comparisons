package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_459 {
    private final Production74_459 production = new Production74_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}