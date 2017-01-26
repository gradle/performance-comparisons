package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_160 {
    private final Production44_160 production = new Production44_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}