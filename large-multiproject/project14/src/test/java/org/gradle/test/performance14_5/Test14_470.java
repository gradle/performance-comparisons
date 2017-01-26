package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_470 {
    private final Production14_470 production = new Production14_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}