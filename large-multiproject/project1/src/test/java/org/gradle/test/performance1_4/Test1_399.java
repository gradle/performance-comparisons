package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_399 {
    private final Production1_399 production = new Production1_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}