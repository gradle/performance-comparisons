package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_448 {
    private final Production59_448 production = new Production59_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}