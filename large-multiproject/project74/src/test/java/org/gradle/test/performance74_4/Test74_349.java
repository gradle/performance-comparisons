package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_349 {
    private final Production74_349 production = new Production74_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}