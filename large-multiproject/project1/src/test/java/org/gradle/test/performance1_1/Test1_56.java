package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_56 {
    private final Production1_56 production = new Production1_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}