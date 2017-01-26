package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_389 {
    private final Production44_389 production = new Production44_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}