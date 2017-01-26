package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_242 {
    private final Production4_242 production = new Production4_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}