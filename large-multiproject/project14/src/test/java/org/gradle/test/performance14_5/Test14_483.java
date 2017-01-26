package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_483 {
    private final Production14_483 production = new Production14_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}