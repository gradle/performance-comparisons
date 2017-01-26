package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_379 {
    private final Production4_379 production = new Production4_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}