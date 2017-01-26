package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_387 {
    private final Production14_387 production = new Production14_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}