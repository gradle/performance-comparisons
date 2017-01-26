package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_274 {
    private final Production74_274 production = new Production74_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}