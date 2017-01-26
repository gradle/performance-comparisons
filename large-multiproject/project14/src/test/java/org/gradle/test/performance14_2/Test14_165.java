package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_165 {
    private final Production14_165 production = new Production14_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}