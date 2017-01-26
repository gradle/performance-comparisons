package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_274 {
    private final Production26_274 production = new Production26_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}