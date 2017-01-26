package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_125 {
    private final Production44_125 production = new Production44_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}