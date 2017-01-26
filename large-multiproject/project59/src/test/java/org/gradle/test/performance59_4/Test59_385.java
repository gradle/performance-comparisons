package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_385 {
    private final Production59_385 production = new Production59_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}