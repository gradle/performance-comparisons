package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_149 {
    private final Production44_149 production = new Production44_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}