package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_354 {
    private final Production14_354 production = new Production14_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}