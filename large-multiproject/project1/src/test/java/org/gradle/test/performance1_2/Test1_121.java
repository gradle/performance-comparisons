package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_121 {
    private final Production1_121 production = new Production1_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}