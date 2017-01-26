package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_192 {
    private final Production4_192 production = new Production4_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}