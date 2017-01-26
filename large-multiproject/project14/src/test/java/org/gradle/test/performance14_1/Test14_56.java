package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_56 {
    private final Production14_56 production = new Production14_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}