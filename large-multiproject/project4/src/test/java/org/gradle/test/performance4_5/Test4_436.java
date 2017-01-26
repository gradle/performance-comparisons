package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_436 {
    private final Production4_436 production = new Production4_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}