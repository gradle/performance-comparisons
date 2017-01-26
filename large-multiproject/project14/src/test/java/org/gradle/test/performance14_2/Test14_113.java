package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_113 {
    private final Production14_113 production = new Production14_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}