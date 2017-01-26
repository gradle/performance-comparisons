package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_185 {
    private final Production74_185 production = new Production74_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}