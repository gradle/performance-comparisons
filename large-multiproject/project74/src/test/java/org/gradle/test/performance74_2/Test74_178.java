package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_178 {
    private final Production74_178 production = new Production74_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}