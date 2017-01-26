package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_239 {
    private final Production14_239 production = new Production14_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}