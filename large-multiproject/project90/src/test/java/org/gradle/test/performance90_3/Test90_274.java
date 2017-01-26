package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_274 {
    private final Production90_274 production = new Production90_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}