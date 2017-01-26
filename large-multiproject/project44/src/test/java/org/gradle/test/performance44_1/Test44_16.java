package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_16 {
    private final Production44_16 production = new Production44_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}