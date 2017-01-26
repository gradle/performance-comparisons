package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_285 {
    private final Production7_285 production = new Production7_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}