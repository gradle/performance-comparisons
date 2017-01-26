package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_221 {
    private final Production4_221 production = new Production4_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}