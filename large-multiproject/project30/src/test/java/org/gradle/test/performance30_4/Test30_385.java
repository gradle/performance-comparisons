package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_385 {
    private final Production30_385 production = new Production30_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}