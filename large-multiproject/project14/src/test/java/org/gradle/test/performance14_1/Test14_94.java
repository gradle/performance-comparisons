package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_94 {
    private final Production14_94 production = new Production14_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}