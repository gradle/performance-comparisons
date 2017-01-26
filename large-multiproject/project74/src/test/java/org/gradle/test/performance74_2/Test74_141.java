package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_141 {
    private final Production74_141 production = new Production74_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}