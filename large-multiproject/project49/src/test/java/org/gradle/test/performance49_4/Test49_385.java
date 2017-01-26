package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_385 {
    private final Production49_385 production = new Production49_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}