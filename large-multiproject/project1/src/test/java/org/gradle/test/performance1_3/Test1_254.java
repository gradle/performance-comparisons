package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_254 {
    private final Production1_254 production = new Production1_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}