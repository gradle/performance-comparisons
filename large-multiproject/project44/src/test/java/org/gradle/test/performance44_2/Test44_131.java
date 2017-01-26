package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_131 {
    private final Production44_131 production = new Production44_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}