package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_409 {
    private final Production74_409 production = new Production74_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}