package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_480 {
    private final Production74_480 production = new Production74_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}