package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_420 {
    private final Production1_420 production = new Production1_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}