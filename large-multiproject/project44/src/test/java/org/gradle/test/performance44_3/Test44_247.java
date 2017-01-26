package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_247 {
    private final Production44_247 production = new Production44_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}