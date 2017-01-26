package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_208 {
    private final Production44_208 production = new Production44_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}