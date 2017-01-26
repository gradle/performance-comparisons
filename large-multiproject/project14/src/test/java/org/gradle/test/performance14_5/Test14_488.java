package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_488 {
    private final Production14_488 production = new Production14_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}