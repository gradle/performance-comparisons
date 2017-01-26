package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_22 {
    private final Production1_22 production = new Production1_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}