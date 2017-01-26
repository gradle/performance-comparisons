package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_206 {
    private final Production14_206 production = new Production14_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}