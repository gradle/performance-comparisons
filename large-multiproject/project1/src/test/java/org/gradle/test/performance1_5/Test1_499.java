package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_499 {
    private final Production1_499 production = new Production1_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}