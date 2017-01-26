package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_247 {
    private final Production4_247 production = new Production4_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}