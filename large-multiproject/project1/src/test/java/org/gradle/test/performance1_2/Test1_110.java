package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_110 {
    private final Production1_110 production = new Production1_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}