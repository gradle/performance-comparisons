package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_177 {
    private final Production1_177 production = new Production1_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}