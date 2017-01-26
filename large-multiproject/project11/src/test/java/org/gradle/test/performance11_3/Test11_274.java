package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_274 {
    private final Production11_274 production = new Production11_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}