package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_131 {
    private final Production1_131 production = new Production1_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}