package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_136 {
    private final Production1_136 production = new Production1_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}