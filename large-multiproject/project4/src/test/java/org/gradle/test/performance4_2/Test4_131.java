package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_131 {
    private final Production4_131 production = new Production4_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}