package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_94 {
    private final Production1_94 production = new Production1_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}