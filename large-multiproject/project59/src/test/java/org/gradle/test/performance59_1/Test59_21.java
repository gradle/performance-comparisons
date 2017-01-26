package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_21 {
    private final Production59_21 production = new Production59_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}