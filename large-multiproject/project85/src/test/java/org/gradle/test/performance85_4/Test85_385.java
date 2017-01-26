package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_385 {
    private final Production85_385 production = new Production85_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}