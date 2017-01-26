package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_242 {
    private final Production1_242 production = new Production1_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}