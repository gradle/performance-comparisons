package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_21 {
    private final Production14_21 production = new Production14_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}