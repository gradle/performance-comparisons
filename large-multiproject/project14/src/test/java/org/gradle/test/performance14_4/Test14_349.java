package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_349 {
    private final Production14_349 production = new Production14_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}