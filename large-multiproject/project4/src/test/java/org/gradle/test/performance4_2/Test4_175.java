package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_175 {
    private final Production4_175 production = new Production4_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}