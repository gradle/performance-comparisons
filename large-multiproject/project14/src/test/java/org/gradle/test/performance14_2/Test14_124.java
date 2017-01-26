package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_124 {
    private final Production14_124 production = new Production14_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}