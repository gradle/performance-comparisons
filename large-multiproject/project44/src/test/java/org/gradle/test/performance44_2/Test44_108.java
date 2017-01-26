package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_108 {
    private final Production44_108 production = new Production44_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}