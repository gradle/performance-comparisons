package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_473 {
    private final Production1_473 production = new Production1_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}