package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_170 {
    private final Production14_170 production = new Production14_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}