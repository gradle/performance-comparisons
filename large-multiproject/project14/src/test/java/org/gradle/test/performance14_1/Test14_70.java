package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_70 {
    private final Production14_70 production = new Production14_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}