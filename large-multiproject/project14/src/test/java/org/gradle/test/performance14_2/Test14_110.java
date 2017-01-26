package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_110 {
    private final Production14_110 production = new Production14_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}