package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_224 {
    private final Production1_224 production = new Production1_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}