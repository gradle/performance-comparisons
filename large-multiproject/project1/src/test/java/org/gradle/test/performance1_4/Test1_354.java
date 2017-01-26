package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_354 {
    private final Production1_354 production = new Production1_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}