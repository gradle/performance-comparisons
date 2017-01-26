package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_274 {
    private final Production39_274 production = new Production39_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}