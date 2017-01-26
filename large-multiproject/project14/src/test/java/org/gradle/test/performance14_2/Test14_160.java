package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_160 {
    private final Production14_160 production = new Production14_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}