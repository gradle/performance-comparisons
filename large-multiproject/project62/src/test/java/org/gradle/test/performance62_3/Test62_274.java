package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_274 {
    private final Production62_274 production = new Production62_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}