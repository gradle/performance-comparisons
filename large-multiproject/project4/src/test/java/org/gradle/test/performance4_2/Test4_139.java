package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_139 {
    private final Production4_139 production = new Production4_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}