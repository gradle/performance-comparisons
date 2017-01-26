package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_274 {
    private final Production15_274 production = new Production15_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}