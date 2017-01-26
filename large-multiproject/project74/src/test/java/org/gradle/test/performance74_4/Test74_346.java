package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_346 {
    private final Production74_346 production = new Production74_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}