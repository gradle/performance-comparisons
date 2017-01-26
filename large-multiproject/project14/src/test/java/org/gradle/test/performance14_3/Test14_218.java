package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_218 {
    private final Production14_218 production = new Production14_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}