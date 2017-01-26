package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_1 {
    private final Production14_1 production = new Production14_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}