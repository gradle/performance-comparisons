package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_284 {
    private final Production14_284 production = new Production14_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}