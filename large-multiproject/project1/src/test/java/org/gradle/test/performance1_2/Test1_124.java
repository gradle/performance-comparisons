package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_124 {
    private final Production1_124 production = new Production1_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}