package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_409 {
    private final Production44_409 production = new Production44_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}