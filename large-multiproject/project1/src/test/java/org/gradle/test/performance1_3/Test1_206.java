package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_206 {
    private final Production1_206 production = new Production1_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}