package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_387 {
    private final Production59_387 production = new Production59_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}