package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_116 {
    private final Production1_116 production = new Production1_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}