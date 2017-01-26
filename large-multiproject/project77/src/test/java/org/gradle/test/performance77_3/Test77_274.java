package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_274 {
    private final Production77_274 production = new Production77_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}