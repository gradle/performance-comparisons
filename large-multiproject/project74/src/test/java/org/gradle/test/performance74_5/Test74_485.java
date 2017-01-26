package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_485 {
    private final Production74_485 production = new Production74_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}