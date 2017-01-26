package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_217 {
    private final Production14_217 production = new Production14_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}