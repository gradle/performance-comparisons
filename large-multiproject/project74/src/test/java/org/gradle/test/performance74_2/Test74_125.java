package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_125 {
    private final Production74_125 production = new Production74_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}