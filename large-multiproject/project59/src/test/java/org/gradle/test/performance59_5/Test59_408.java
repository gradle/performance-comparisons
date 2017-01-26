package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_408 {
    private final Production59_408 production = new Production59_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}