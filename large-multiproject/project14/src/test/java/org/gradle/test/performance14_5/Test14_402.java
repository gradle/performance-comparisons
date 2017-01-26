package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_402 {
    private final Production14_402 production = new Production14_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}