package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_143 {
    private final Production1_143 production = new Production1_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}