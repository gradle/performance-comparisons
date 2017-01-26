package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_430 {
    private final Production59_430 production = new Production59_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}