package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_120 {
    private final Production1_120 production = new Production1_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}