package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_233 {
    private final Production44_233 production = new Production44_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}