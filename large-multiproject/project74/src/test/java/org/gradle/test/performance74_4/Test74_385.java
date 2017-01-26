package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_385 {
    private final Production74_385 production = new Production74_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}