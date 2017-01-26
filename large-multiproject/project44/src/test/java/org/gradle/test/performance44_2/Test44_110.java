package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_110 {
    private final Production44_110 production = new Production44_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}