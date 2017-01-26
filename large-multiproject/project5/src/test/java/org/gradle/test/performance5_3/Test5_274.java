package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_274 {
    private final Production5_274 production = new Production5_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}