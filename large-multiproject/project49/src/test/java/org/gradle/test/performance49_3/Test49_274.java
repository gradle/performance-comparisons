package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_274 {
    private final Production49_274 production = new Production49_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}