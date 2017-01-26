package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_341 {
    private final Production4_341 production = new Production4_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}