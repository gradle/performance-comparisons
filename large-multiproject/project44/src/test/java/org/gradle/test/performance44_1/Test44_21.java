package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_21 {
    private final Production44_21 production = new Production44_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}