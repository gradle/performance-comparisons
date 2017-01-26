package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_318 {
    private final Production1_318 production = new Production1_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}