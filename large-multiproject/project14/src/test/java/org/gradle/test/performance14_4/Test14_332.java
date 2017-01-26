package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_332 {
    private final Production14_332 production = new Production14_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}