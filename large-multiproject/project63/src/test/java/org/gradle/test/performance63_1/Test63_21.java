package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_21 {
    private final Production63_21 production = new Production63_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}