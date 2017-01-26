package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_483 {
    private final Production44_483 production = new Production44_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}