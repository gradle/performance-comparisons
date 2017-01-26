package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_94 {
    private final Production7_94 production = new Production7_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}