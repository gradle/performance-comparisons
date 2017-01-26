package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_486 {
    private final Production14_486 production = new Production14_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}