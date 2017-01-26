package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_94 {
    private final Production30_94 production = new Production30_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}