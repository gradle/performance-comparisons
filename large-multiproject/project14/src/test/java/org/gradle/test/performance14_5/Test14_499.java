package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_499 {
    private final Production14_499 production = new Production14_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}