package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_103 {
    private final Production1_103 production = new Production1_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}