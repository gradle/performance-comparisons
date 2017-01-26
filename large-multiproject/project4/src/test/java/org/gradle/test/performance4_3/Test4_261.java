package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_261 {
    private final Production4_261 production = new Production4_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}