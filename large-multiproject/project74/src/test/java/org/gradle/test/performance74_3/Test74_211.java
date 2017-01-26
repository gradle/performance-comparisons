package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_211 {
    private final Production74_211 production = new Production74_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}