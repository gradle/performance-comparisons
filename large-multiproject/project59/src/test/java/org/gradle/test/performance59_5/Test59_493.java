package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_493 {
    private final Production59_493 production = new Production59_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}