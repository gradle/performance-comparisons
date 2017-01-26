package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_420 {
    private final Production74_420 production = new Production74_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}