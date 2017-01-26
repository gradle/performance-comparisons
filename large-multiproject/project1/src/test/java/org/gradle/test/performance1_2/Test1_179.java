package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_179 {
    private final Production1_179 production = new Production1_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}