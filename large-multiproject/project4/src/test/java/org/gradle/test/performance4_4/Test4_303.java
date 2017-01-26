package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_303 {
    private final Production4_303 production = new Production4_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}