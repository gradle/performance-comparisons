package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_152 {
    private final Production44_152 production = new Production44_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}