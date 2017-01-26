package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_221 {
    private final Production44_221 production = new Production44_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}