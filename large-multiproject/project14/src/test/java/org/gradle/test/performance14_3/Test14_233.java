package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_233 {
    private final Production14_233 production = new Production14_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}