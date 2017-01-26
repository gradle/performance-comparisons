package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_226 {
    private final Production1_226 production = new Production1_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}