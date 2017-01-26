package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_383 {
    private final Production59_383 production = new Production59_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}