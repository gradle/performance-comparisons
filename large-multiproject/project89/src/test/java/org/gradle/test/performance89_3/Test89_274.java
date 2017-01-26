package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_274 {
    private final Production89_274 production = new Production89_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}