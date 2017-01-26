package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_346 {
    private final Production1_346 production = new Production1_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}