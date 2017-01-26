package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_274 {
    private final Production18_274 production = new Production18_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}