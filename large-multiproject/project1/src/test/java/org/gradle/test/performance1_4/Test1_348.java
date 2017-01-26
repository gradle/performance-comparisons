package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_348 {
    private final Production1_348 production = new Production1_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}