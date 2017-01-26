package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_473 {
    private final Production14_473 production = new Production14_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}