package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_262 {
    private final Production59_262 production = new Production59_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}