package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_252 {
    private final Production14_252 production = new Production14_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}