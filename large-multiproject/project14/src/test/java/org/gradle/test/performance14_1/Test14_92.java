package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_92 {
    private final Production14_92 production = new Production14_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}