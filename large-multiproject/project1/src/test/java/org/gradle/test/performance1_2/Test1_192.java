package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_192 {
    private final Production1_192 production = new Production1_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}