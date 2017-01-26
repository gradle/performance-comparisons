package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_279 {
    private final Production1_279 production = new Production1_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}