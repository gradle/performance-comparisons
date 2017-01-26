package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_385 {
    private final Production60_385 production = new Production60_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}