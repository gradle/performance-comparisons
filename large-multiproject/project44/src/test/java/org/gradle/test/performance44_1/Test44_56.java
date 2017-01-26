package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_56 {
    private final Production44_56 production = new Production44_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}