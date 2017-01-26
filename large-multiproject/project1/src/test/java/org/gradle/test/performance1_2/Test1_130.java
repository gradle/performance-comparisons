package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_130 {
    private final Production1_130 production = new Production1_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}