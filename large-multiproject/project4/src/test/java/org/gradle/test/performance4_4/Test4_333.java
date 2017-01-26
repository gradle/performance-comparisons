package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_333 {
    private final Production4_333 production = new Production4_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}