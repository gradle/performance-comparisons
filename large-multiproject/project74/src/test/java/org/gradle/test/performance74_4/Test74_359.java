package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_359 {
    private final Production74_359 production = new Production74_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}