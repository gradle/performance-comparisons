package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_240 {
    private final Production74_240 production = new Production74_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}