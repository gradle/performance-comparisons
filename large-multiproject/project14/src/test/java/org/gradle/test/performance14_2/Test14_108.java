package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_108 {
    private final Production14_108 production = new Production14_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}