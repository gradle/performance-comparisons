package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_333 {
    private final Production44_333 production = new Production44_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}