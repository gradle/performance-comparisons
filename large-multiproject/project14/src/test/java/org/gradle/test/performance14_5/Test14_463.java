package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_463 {
    private final Production14_463 production = new Production14_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}