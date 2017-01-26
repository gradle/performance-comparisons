package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_18 {
    private final Production14_18 production = new Production14_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}