package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_420 {
    private final Production4_420 production = new Production4_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}