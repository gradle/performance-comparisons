package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_407 {
    private final Production14_407 production = new Production14_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}