package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_381 {
    private final Production4_381 production = new Production4_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}