package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_131 {
    private final Production14_131 production = new Production14_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}