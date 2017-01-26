package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_208 {
    private final Production4_208 production = new Production4_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}