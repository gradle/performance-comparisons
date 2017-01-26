package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_177 {
    private final Production14_177 production = new Production14_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}