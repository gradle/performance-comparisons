package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_298 {
    private final Production74_298 production = new Production74_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}