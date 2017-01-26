package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_146 {
    private final Production1_146 production = new Production1_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}