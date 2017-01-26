package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_413 {
    private final Production74_413 production = new Production74_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}