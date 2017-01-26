package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_274 {
    private final Production1_274 production = new Production1_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}