package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_274 {
    private final Production92_274 production = new Production92_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}