package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_160 {
    private final Production1_160 production = new Production1_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}