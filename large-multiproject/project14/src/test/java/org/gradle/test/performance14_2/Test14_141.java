package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_141 {
    private final Production14_141 production = new Production14_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}