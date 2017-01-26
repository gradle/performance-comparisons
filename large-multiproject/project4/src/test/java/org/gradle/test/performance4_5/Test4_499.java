package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_499 {
    private final Production4_499 production = new Production4_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}