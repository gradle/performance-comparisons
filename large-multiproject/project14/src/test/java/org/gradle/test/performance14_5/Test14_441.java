package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_441 {
    private final Production14_441 production = new Production14_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}