package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_190 {
    private final Production14_190 production = new Production14_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}