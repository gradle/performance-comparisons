package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_276 {
    private final Production14_276 production = new Production14_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}