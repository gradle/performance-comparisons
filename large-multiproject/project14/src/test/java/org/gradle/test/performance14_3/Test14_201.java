package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_201 {
    private final Production14_201 production = new Production14_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}