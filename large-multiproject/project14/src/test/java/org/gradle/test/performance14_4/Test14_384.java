package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_384 {
    private final Production14_384 production = new Production14_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}