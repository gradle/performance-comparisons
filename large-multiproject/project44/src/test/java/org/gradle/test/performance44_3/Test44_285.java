package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_285 {
    private final Production44_285 production = new Production44_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}