package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_280 {
    private final Production1_280 production = new Production1_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}