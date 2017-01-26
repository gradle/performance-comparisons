package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_312 {
    private final Production1_312 production = new Production1_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}