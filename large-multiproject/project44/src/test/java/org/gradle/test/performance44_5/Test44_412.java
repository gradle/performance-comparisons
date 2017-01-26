package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_412 {
    private final Production44_412 production = new Production44_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}