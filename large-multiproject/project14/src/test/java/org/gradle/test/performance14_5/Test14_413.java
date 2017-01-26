package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_413 {
    private final Production14_413 production = new Production14_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}