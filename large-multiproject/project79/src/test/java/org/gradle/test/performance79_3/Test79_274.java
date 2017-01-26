package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_274 {
    private final Production79_274 production = new Production79_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}