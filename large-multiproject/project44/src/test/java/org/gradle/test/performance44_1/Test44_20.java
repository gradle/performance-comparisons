package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_20 {
    private final Production44_20 production = new Production44_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}