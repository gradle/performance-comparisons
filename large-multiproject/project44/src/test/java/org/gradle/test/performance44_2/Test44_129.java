package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_129 {
    private final Production44_129 production = new Production44_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}