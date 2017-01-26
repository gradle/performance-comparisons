package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_312 {
    private final Production14_312 production = new Production14_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}