package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_117 {
    private final Production59_117 production = new Production59_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}