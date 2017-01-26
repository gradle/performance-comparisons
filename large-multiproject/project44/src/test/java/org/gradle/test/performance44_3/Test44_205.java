package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_205 {
    private final Production44_205 production = new Production44_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}