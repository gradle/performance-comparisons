package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_333 {
    private final Production14_333 production = new Production14_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}