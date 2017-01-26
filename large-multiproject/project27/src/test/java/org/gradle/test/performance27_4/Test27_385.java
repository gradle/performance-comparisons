package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_385 {
    private final Production27_385 production = new Production27_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}