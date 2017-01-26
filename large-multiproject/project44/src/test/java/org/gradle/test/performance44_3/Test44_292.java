package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_292 {
    private final Production44_292 production = new Production44_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}