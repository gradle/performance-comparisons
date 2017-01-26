package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_115 {
    private final Production14_115 production = new Production14_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}