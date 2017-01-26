package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_274 {
    private final Production4_274 production = new Production4_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}