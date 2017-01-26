package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_414 {
    private final Production14_414 production = new Production14_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}