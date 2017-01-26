package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_258 {
    private final Production4_258 production = new Production4_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}