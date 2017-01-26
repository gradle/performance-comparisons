package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_250 {
    private final Production14_250 production = new Production14_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}