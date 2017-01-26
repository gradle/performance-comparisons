package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_342 {
    private final Production14_342 production = new Production14_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}