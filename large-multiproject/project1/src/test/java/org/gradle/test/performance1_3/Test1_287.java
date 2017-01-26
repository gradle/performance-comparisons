package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_287 {
    private final Production1_287 production = new Production1_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}