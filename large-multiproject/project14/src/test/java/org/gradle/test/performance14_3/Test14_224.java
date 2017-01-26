package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_224 {
    private final Production14_224 production = new Production14_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}