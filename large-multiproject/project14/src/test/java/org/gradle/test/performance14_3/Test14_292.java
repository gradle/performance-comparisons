package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_292 {
    private final Production14_292 production = new Production14_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}