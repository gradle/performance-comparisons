package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_412 {
    private final Production4_412 production = new Production4_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}