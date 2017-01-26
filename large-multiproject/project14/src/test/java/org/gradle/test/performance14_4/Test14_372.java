package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_372 {
    private final Production14_372 production = new Production14_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}