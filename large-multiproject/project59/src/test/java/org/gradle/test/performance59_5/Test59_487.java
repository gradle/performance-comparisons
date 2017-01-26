package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_487 {
    private final Production59_487 production = new Production59_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}