package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_486 {
    private final Production44_486 production = new Production44_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}