package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_280 {
    private final Production14_280 production = new Production14_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}