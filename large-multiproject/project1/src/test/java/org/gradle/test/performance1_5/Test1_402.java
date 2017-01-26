package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_402 {
    private final Production1_402 production = new Production1_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}