package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_462 {
    private final Production44_462 production = new Production44_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}