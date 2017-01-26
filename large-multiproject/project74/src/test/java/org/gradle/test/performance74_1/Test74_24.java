package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_24 {
    private final Production74_24 production = new Production74_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}