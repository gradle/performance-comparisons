package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_32 {
    private final Production14_32 production = new Production14_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}