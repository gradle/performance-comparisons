package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_285 {
    private final Production1_285 production = new Production1_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}