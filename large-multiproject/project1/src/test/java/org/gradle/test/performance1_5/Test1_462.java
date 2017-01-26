package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_462 {
    private final Production1_462 production = new Production1_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}