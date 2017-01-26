package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_420 {
    private final Production14_420 production = new Production14_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}