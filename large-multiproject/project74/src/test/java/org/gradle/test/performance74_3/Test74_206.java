package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_206 {
    private final Production74_206 production = new Production74_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}