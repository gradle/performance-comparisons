package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_385 {
    private final Production15_385 production = new Production15_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}