package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_271 {
    private final Production14_271 production = new Production14_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}