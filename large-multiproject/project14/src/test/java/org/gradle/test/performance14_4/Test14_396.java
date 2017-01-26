package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_396 {
    private final Production14_396 production = new Production14_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}