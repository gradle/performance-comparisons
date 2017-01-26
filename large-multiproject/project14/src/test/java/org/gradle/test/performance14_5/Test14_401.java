package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_401 {
    private final Production14_401 production = new Production14_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}