package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_274 {
    private final Production20_274 production = new Production20_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}