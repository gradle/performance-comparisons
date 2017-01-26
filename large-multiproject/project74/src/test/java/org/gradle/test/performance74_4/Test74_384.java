package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_384 {
    private final Production74_384 production = new Production74_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}