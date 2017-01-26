package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_132 {
    private final Production74_132 production = new Production74_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}