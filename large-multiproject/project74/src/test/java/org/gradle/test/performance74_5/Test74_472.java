package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_472 {
    private final Production74_472 production = new Production74_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}