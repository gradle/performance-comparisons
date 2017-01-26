package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_201 {
    private final Production1_201 production = new Production1_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}