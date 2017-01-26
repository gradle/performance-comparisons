package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_194 {
    private final Production74_194 production = new Production74_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}