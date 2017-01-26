package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_21 {
    private final Production1_21 production = new Production1_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}