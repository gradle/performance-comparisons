package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_379 {
    private final Production14_379 production = new Production14_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}