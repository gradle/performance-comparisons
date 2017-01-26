package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_221 {
    private final Production1_221 production = new Production1_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}