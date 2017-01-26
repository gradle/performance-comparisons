package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_399 {
    private final Production59_399 production = new Production59_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}