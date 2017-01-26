package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_274 {
    private final Production60_274 production = new Production60_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}