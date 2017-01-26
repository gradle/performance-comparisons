package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_178 {
    private final Production1_178 production = new Production1_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}