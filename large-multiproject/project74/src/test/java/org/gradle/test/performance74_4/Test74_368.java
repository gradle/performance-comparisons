package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_368 {
    private final Production74_368 production = new Production74_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}