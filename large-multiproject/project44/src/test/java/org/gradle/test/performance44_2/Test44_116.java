package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_116 {
    private final Production44_116 production = new Production44_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}