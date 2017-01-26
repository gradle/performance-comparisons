package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_473 {
    private final Production44_473 production = new Production44_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}