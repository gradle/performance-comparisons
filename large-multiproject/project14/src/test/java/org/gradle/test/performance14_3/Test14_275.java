package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_275 {
    private final Production14_275 production = new Production14_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}