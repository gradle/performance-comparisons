package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_304 {
    private final Production4_304 production = new Production4_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}