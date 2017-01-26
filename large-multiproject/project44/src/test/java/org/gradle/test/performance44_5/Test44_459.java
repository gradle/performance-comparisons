package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_459 {
    private final Production44_459 production = new Production44_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}