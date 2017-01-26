package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_414 {
    private final Production1_414 production = new Production1_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}