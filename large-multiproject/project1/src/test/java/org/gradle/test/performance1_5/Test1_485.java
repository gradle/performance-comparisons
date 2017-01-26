package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_485 {
    private final Production1_485 production = new Production1_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}