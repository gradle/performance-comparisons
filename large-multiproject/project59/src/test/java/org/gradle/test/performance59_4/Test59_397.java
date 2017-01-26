package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_397 {
    private final Production59_397 production = new Production59_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}