package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_233 {
    private final Production1_233 production = new Production1_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}