package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_317 {
    private final Production4_317 production = new Production4_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}