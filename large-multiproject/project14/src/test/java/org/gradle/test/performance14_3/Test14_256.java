package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_256 {
    private final Production14_256 production = new Production14_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}