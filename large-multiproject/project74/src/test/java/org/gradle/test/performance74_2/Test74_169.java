package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_169 {
    private final Production74_169 production = new Production74_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}